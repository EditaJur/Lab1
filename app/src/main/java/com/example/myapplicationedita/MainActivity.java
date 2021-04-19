package com.example.myapplicationedita;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMain;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvMain = findViewById(R.id.tvMain);
        this. button2 = findViewById(R.id. button2);
    }

    public void OnBtnclick(View view) {
        this.tvMain.setText("Text was changed!");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMain.setTextColor(Color.YELLOW);
            }
        });
    }
}