package com.example.pungi.ride2there;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pungi on 12-Apr-17.
 */

public class feedView extends Activity {

    private UserPostActivity userP = new UserPostActivity();
    private List<UserPost> userPostsList;
    private ListView listView;
    private userPostAdapter userPostAdapter;

    Button alert;
    Button mgs;
    Button stg;

    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_feed);

        initUserPost();
        listView = (ListView) findViewById(R.id.postList);
        userPostAdapter = new userPostAdapter(
                this, R.layout.activity_post, userPostsList);

        listView.setAdapter(userPostAdapter);

        //when click on either of the three button
        alert = (Button) findViewById(R.id.notif);

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notificationIntent = new Intent(feedView.this,notification.class);
                startActivity(notificationIntent);
            }
        });

        mgs = (Button) findViewById(R.id.convo);

        mgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notificationIntent = new Intent(feedView.this,message.class);
                startActivity(notificationIntent);
            }
        });

        stg = (Button) findViewById(R.id.setgs);

        stg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notificationIntent = new Intent(feedView.this,setting.class);
                startActivity(notificationIntent);
            }
        });


    }
    private void initUserPost() {
        userPostsList = new ArrayList<UserPost>() {{
            add(new UserPost("Allison", 24, R.drawable.friend_1));
            add(new UserPost("Jenny", 2, R.drawable.friend_2));
            add(new UserPost("Meghan", 14, R.drawable.friend_3));
            add(new UserPost("David", 5, R.drawable.friend_4));
            add(new UserPost("Eric", 19, R.drawable.friend_5));
            add(new UserPost("Tom", 20, R.drawable.friend_6));
            add(new UserPost("Amy", 24, R.drawable.friend_1));
            add(new UserPost("Ben", 2, R.drawable.friend_2));
            add(new UserPost("Carol", 14, R.drawable.friend_3));
            add(new UserPost("Frank", 5, R.drawable.friend_4));
            add(new UserPost("Ryan", 19, R.drawable.friend_5));
            add(new UserPost("Anthony", 20, R.drawable.friend_6));
        }};
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.ride2there, menu);
        return true;
    }
}
