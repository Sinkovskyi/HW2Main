package com.example.admin.homework2main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button bottonOnTheSecondActivity;
    EditText editTextOnTheSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bottonOnTheSecondActivity = (Button) findViewById(R.id.ButtonOnTheFirstActivity);
        editTextOnTheSecondActivity = (EditText) findViewById(R.id.EditTextOnTheSecondActivity);

        bottonOnTheSecondActivity.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ButtonOnTheFirstActivity:
                //or editTextOnTheSecondActivity.getText().length() == 0
                if(editTextOnTheSecondActivity.getText().toString().equals("")){
                    Toast toast = Toast.makeText(SecondActivity.this,"Вы ничего не ввели, пожалуйста введите текст"+ editTextOnTheSecondActivity.getText(),Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                }
                else{
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("text",editTextOnTheSecondActivity.getText().toString());
                    startActivity(intent);
                }
        }

    }
}
