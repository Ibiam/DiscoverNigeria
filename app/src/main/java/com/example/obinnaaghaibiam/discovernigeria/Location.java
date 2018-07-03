package com.example.obinnaaghaibiam.discovernigeria;

public class Location {
    /**
     * Default name for the Location
     */
    private String mDefaultName;
    /**
     * Discover Nigeria details summary for the Location
     */
    private String mLocationDetailsSummary;
    /**
     * Discover Nigeria image resource for the Location
     */
    private static int mImageResourceId;

    /**
     * Create a new Word object.
     * @param defaultName is the location name the user is to be familiar with
     * @param locationDetailsSummary   is the location summary details
     * @param imageResourceId
     */
    public Location(String defaultName, String locationDetailsSummary, int imageResourceId) {
        mDefaultName = defaultName;
        mLocationDetailsSummary = locationDetailsSummary;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default name of the location.
     */
    public String getmDefaultName() {
        return mDefaultName;
    }

    /**
     * Get the Discover Nigeria details summary of the location.
     */
    public String getmLocationDetailsSummary() {
        return mLocationDetailsSummary;
    }

    /**
     * Get the Discover Nigeria image resource of the location.
     */
    public static int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Location{" +
                "mDefaultName='" + mDefaultName + '\'' +
                ", mLocationDetailsSummary='" + mLocationDetailsSummary + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

}
