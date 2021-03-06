package com.example.brian.android_fragments_lt4.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Brian on 12/01/2015.
 */
public class Flight implements Serializable {

    private String origin;
    private String destination;


    private Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }


    // replacing (previous) public Constructor above, with a Factory Method
    public static Flight createFlight(String origin, String destination)
    {
        return new Flight(origin, destination);
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin(){
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    @Override
    public String toString() {
        return this.origin + " - " + this.destination;
    }
}
