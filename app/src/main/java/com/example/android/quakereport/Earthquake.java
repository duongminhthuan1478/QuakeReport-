package com.example.android.quakereport;

/**
 * Created by Dell on 9/6/2017.
 */

public class Earthquake {

    /** Magnitude of the Earthquake */
    private double mMagnitude;

    /** Location of the Earthquake */
    private String mLocation;

    /** Date of the Earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /** Constructor a new Object
     *  @param magnitude is the magnitude(size) of the Earthquake
     *  @param location is the city location of the Earthquake
     *  @param time is the date of the earthquake happened
     *  @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long time, String url) {
        mMagnitude = magnitude;
        mLocation = location;
       mTimeInMilliseconds = time;
        mUrl = url;
    }

    /** Return the magnitude of the earthquake*/
    public double getmMagnitude() {
        return mMagnitude;
    }

    /** Return the location of the earthquake*/
    public String getmLocation() {
        return mLocation;
    }

    /** Return the date of the earthquake*/
    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /** Returns the website URL to find more information about the earthquake. */
    public String getmUrl() {
        return mUrl;
    }
}