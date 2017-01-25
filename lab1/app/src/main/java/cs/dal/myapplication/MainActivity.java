package cs.dal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button stap;
    TextView show;
    Button reset;
    public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stap = (Button)findViewById(R.id.button4);
        reset = (Button)findViewById(R.id.button5);
        show = (TextView)findViewById(R.id.textView2);


        stap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               new CountDownTimer(10000,100){

                    @Override
                    public void onTick(long l)
                    {
                        count++;
                        show.setText(Integer.toString(count));
                    }

                    public void onFinish(){
                        count = 0;
                        Intent i = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(i);

                    }
                }.start();
            }
        });





    }
}
