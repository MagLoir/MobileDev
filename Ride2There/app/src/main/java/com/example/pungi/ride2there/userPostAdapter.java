package com.example.pungi.ride2there;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pungi on 24-Apr-17.
 */

public class userPostAdapter extends ArrayAdapter<UserPost> {

    private Context context;
    private int layoutResource;
    private List<UserPost> friendRecommendations;

    public userPostAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<UserPost> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutResource = resource;
        this.friendRecommendations = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layoutResource, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.profileImageView);
        imageView.setImageResource(friendRecommendations.get(position).getProfileIconImageRes());

        TextView textViewName = (TextView) view.findViewById(R.id.friendNameTextView);
        textViewName.setText(friendRecommendations.get(position).getName());

        /*TextView textViewNum = (TextView) view.findViewById(R.id.numFriendsTextView);
        textViewNum.setText(friendRecommendations.get(position).getNumMutualFriends() + " mutual friends");*/

       /* Button addFriendButton = (Button) view.findViewById(R.id.addFriendButton);*//*
        addFriendButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        friendRecommendations.remove(position);
        notifyDataSetChanged();
        }
        });
*/
        return view;

    }
}
