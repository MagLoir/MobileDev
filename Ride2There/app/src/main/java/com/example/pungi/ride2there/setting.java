package com.example.pungi.ride2there;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by pungi on 24-Apr-17.
 */

public class setting extends Activity {

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_para);

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ride2there, menu);
        return true;
    }
}
