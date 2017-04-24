package com.example.pungi.ride2there;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pungi on 24-Apr-17.
 */

public class UserPostActivity extends AppCompatActivity

    {

        private List<UserPost> userPostsList;
        private ListView listView;
        private userPostAdapter userPostAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_feed);

            initUserPost();

           /* Button button = (Button) findViewById(R.id.createRecommendationButton);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FriendRecommendation friendRecommendation =
                            new FriendRecommendation("New Friend",
                                    new Random().nextInt(30),
                                    R.drawable.friend_5);
                    friendRecommendationArrayAdapter.add(friendRecommendation);
                    friendRecommendationArrayAdapter.notifyDataSetChanged();
                }
            });*/

            listView = (ListView) findViewById(R.id.postList);
            userPostAdapter = new userPostAdapter(
                    this, R.layout.activity_post, userPostsList);

            listView.setAdapter(userPostAdapter);
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
}


