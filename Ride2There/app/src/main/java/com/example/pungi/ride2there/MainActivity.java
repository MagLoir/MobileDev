package com.example.pungi.ride2there;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable{
    EditText editText;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ride2there);

        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPinIntent = new Intent(MainActivity.this,enterPIN.class);
                startActivity(myPinIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ride2there, menu);
        return true;
    }

   /* public void displayEnterPinIntent(View view){
        Intent enterPinIntent = new Intent(this,enterPIN.class);
        startActivity(enterPinIntent);
    }*/
}
