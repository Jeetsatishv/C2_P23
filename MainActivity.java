package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View lamp = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    lamp.setBackgroundColor(-65536);
                    num = 1;
                } else if (num == 1) {
                    lamp.setBackgroundColor(Color.parseColor("#ffff00"));
                    num = 2;
                } else if (num == 2) {
                    lamp.setBackgroundColor(-16711936);
                    num = 0;
                }
            }

        });

    }
}