package cs.dal.lab8;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener
{

    private LinearLayout profile;
    private Button signout;
    private SignInButton signin;
    private TextView nameT,emailT;
    private ImageView prof_pic;
    private GoogleApiClient gapic;
    private static final int REQCODE = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile = (LinearLayout)findViewById(R.id.profile_layout);
        signout = (Button)findViewById(R.id.signout);
        signin = (SignInButton) findViewById(R.id.googleButt);
        nameT = (TextView)findViewById(R.id.name);
        prof_pic = (ImageView)findViewById(R.id.propic);
        emailT = (TextView)findViewById(R.id.email);
        signin.setOnClickListener(this);
        signout.setOnClickListener(this);


        //profile.setVisibility(View.GONE);
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gapic = new GoogleApiClient.Builder(this).enableAutoManage(this,this).addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();



    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()){
        case R.id.googleButt:
            signin();
            break;

            case R.id.signout:
                signout();
                break;

        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult)
    {

    }

    private void signin()
    {
        Intent SignIntent = Auth.GoogleSignInApi.getSignInIntent(gapic);
        startActivityForResult(SignIntent,REQCODE);

    }
    private void signout()
    {
        Auth.GoogleSignInApi.signOut(gapic).setResultCallback(new ResultCallback<Status>()
        {
            @Override
            public void onResult(@NonNull Status status)
            {
                changeUI(false);
            }
        });
    }

    private void handleres(GoogleSignInResult res)
    {

            GoogleSignInAccount ga = res.getSignInAccount();
            String name = ga.getDisplayName();
            nameT.setText(name);
            String email = ga.getEmail();
            emailT.setText(email);
            Uri image_url = ga.getPhotoUrl();
            Glide.with(this).load(image_url).into(prof_pic);
            changeUI(true);
    }

    private void changeUI(boolean val)
    {
        if (val){
            profile.setVisibility(View.VISIBLE);
            signin.setVisibility(View.VISIBLE);
        }
        else if(val = false){
            profile.setVisibility(View.VISIBLE);
            signin.setVisibility(View.VISIBLE);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==REQCODE){
            GoogleSignInResult gsr = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleres(gsr);
        }
    }
}
