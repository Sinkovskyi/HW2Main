package com.example.admin.homework2main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textViewOnTheThirdActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textViewOnTheThirdActivity =(TextView) findViewById(R.id.TextViewOnTheThirdActivity);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        textViewOnTheThirdActivity.setText(text);

    }
}
