package com.example.pradhuman.my__twitter__app.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;



public class SearchTweetResponse {
    @SerializedName("statuses")
    ArrayList<TweetResponse> tweetResponseArrayList;

    public ArrayList<TweetResponse> getTweetResponseArrayList() {
        return tweetResponseArrayList;
    }

    public void setTweetResponseArrayList(ArrayList<TweetResponse> tweetResponseArrayList) {
        this.tweetResponseArrayList = tweetResponseArrayList;
    }
}
