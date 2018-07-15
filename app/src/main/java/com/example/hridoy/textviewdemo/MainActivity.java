package com.example.hridoy.textviewdemo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button counter_btn;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter_btn = findViewById(R.id.counter_btn);

        View.OnClickListener clickListener;

        clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                Toast.makeText(MainActivity.this,"Counter is :"+ i,Toast.LENGTH_LONG).show();

            }
        };


        counter_btn.setOnClickListener(clickListener);


    }
}
