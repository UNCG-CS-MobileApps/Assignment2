package csc495s15.assignment2;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * Created by Andrew Schaefer on 1/8/15.
 */
public class PositionPlayer {

    private String positionName;
    private String firstName;
    private String lastName;

    public PositionPlayer(String p, String f, String l) {
        positionName = p;
        firstName = f;
        lastName = l;
    }

    public void setPositionName(String p) {
        positionName = p;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return positionName + " - " + firstName + " " + lastName;
    }
}
