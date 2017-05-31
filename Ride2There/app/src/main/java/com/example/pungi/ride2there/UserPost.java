package com.example.pungi.ride2there;

/**
 * Created by pungi on 24-Apr-17.
 */

public class UserPost {
    private String name;
    private int numMutualFriends;
    private int profileIconImageRes;

    public UserPost() {

    }

    public UserPost(String name, int numMutualFriends, int profileIconImageRes) {
        this.name = name;
        this.numMutualFriends = numMutualFriends;
        this.profileIconImageRes = profileIconImageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMutualFriends() {
        return numMutualFriends;
    }

    public void setNumMutualFriends(int numMutualFriends) {
        this.numMutualFriends = numMutualFriends;
    }

    public int getProfileIconImageRes() {
        return profileIconImageRes;
    }

    public void setProfileIconImageRes(int profileIconImageRes) {
        this.profileIconImageRes = profileIconImageRes;
    }
}


