package com.example.mynjp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String nama;
    private String alamat;


    public User(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;

    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public User() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
    }

    protected User(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
