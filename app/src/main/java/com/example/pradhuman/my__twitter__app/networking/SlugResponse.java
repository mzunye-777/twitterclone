package com.example.pradhuman.my__twitter__app.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;




public class SlugResponse {
    @SerializedName("users")
    ArrayList<ProfileResponse> profileResponseArrayList;

    public ArrayList<ProfileResponse> getProfileResponseArrayList() {
        return profileResponseArrayList;
    }

    public void setProfileResponseArrayList(ArrayList<ProfileResponse> profileResponseArrayList) {
        this.profileResponseArrayList = profileResponseArrayList;
    }
}
