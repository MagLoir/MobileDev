package com.example.pungi.ride2there;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by pungi on 12-Apr-17.
 */

public class feedView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_feed);
    }
}
