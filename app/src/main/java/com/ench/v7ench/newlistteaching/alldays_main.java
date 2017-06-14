package com.ench.v7ench.newlistteaching;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by vignesh2514 on 13/6/17.
 */

public class alldays_main implements Parcelable{

    String id;
    String daysofwhat;
String abc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDaysofwhat() {
        return daysofwhat;
    }

    public void setDaysofwhat(String daysofwhat) {
        this.daysofwhat = daysofwhat;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public static Creator<alldays_main> getCREATOR() {
        return CREATOR;
    }

    protected alldays_main(Parcel in) {
        id = in.readString();
        daysofwhat = in.readString();
        abc = in.readString();
    }

    public static final Creator<alldays_main> CREATOR = new Creator<alldays_main>() {
        @Override
        public alldays_main createFromParcel(Parcel in) {
            return new alldays_main(in);
        }

        @Override
        public alldays_main[] newArray(int size) {
            return new alldays_main[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(daysofwhat);
        dest.writeString(abc);
    }
}
