package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean buttonTap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンの設定
        Button button = findViewById(R.id.button);

        // TextViewの設定
        textView = findViewById(R.id.text_view);

        button.setOnClickListener( v -> {
            if (buttonTap){
                textView.setText("Hello");
                buttonTap = false;
            } else {
                textView.setText("world");
                buttonTap = true;
            }
        });
    }
}