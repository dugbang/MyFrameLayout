package com.example.shbae.myframelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
    }

    public void onButton1Clicked(View v) {
        index += 1;
        if (index > 1) {
            index = 0;
        }

        if (index == 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
        } else if (index==1) {
            imageView.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.VISIBLE);
        }
    }
}
