package com.example.android.tourguideistanbul;

public class Places {

    private String mPlaceName;
    private String mPlaceInformation;
    private String mAddress;
    private int mImageResourceId;

    public Places(String placeName, String placeInformation, String address, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceInformation = placeInformation;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceInformaation() {
        return mPlaceInformation;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
