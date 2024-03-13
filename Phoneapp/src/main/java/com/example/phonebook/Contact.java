package com.example.phonebook;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int imageResource;
    private String address;

    public Contact(String firstName, String lastName, String phoneNumber, String email, int imageResource, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imageResource = imageResource;
        this.address = address;
    }

    protected Contact(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        phoneNumber = in.readString();
        email = in.readString();
        imageResource = in.readInt();
        address = in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(phoneNumber);
        dest.writeString(email);
        dest.writeInt(imageResource);
        dest.writeString(address);
    }
}
