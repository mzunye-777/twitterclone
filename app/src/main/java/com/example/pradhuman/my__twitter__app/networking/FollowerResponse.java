package com.example.pradhuman.my__twitter__app.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;



public class FollowerResponse {


    @SerializedName("users")

    ArrayList<ProfileResponse> profileResponses;
    public ArrayList<ProfileResponse> getProfileResponses() {
        return profileResponses;
    }

    public void setProfileResponses(ArrayList<ProfileResponse> profileResponses) {
        this.profileResponses = profileResponses;
    }

}
