package cs.dal.app2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button2);
        tv = (TextView) findViewById(R.id.textVieww);
        tv.setText("Successfully created!!");
    }

    public void  clickme(View view){
        tv.setText("clicked!!");
    }
}
