package com.example.pungi.ride2there;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.pungi.ride2there.R.id.register;

/**
 * Created by pungi on 12-Apr-17.
 */

public class enterPIN extends Activity{

    TextView editMessage;
    Button verify;
    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_pin);

        verify = (Button) findViewById(R.id.verify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myPinIntent = new Intent(enterPIN.this,feedView.class);
                startActivity(myPinIntent);
            }
        });


    }

    //might not need this method in the long run
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ride2there, menu);
        return true;
    }

}
