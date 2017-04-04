package edu.uw.layoutdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "LAYOUT_DEMO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            //do stuf
            LayoutInflater inflator = getLayoutInflater();
            //inflator.inflate()
        });

        ImageView img = (ImageView)findViewById(R.id.imgCat);
        img.setImageResource(R.drawable.android_maneki); // Dynamically set image resource
    }
}
