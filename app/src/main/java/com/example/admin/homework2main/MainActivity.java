package com.example.admin.homework2main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonOnTheFirstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        buttonOnTheFirstActivity = (Button) findViewById(R.id.ButtonOnTheFirstActivity);
        buttonOnTheFirstActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ButtonOnTheFirstActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
