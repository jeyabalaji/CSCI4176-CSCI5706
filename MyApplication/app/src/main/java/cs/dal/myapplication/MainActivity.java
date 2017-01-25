package cs.dal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button1);

    }

    public void clickme(View view){
        tv.setText("Click Succesful!!");
    }



}
