package com.example.cm_helpline.ui;

import androidx.navigation.NavType;

import java.io.Serializable;

public class User implements Serializable {

    String mName;
    String mPhoneNumber;
    String mAddress;
    String mGrievanceTittle;
    String getmGrievanceDescription;

    public User(String mName, String mPhoneNumber, String mAddress, String mGrievanceTittle, String getmGrievanceDescription) {
        this.mName = mName;
        this.mPhoneNumber = mPhoneNumber;
        this.mAddress = mAddress;
        this.mGrievanceTittle = mGrievanceTittle;
        this.getmGrievanceDescription = getmGrievanceDescription;
    }

    @Override
    public String toString() {
        return "User{" +
                "mName='" + mName + '\'' +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mGrievanceTittle='" + mGrievanceTittle + '\'' +
                ", getmGrievanceDescription='" + getmGrievanceDescription + '\'' +
                '}';
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmGrievanceTittle() {
        return mGrievanceTittle;
    }

    public void setmGrievanceTittle(String mGrievanceTittle) {
        this.mGrievanceTittle = mGrievanceTittle;
    }

    public String getGetmGrievanceDescription() {
        return getmGrievanceDescription;
    }

    public void setGetmGrievanceDescription(String getmGrievanceDescription) {
        this.getmGrievanceDescription = getmGrievanceDescription;
    }
}
