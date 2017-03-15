package cs.dal.grid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
{
    public GridView gridView;
    public String[] items = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25","26","27","28",
            "29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50",
    "51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74", "75",
    "76","77","78","79","80", "81"};
    //private final String[] items2 = new String[]{"n1","n2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         gridView = (GridView) this.findViewById(R.id.myGridView);
        CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
        gridView.setAdapter(gridAdapter);
    }



    public void set1(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "1";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set2(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "2";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }


    public void set3(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "3";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }


    public void set4(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "4";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set5(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "5";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set6(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "6";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set7(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "7";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set8(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "8";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

    public void set9(View view){
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Log.i(Integer.toString(i),"i");

                String s = (String) gridView.getItemAtPosition(i);
                int c = Integer.parseInt(s);
                items[c-1] = "9";
                CustomGridAdapter gridAdapter = new CustomGridAdapter(MainActivity.this, items);
                gridView.setAdapter(gridAdapter);

            }
        });
    }

}
