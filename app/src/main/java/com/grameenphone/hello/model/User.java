package com.grameenphone.hello.model;


public class User {
    public String uid;
    public String phone;
    public String name;
    public String photoUrl;


    public String firebaseToken;



    public boolean isAdmin;

    public User() {}

    public User(String uid, String name, String phone, String photoUrl) {
        this.uid = uid;
        this.phone = phone;
        this.name = name;
        this.photoUrl = photoUrl;
    }



    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }
}