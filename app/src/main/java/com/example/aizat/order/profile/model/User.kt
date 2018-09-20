package com.example.aizat.order.profile.model

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**
 * Created by Aizat on 18.09.2018.
 */
class User(val surname: String, val name: String, val id: Int) : Parcelable,Serializable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(surname)
        parcel.writeString(name)
        parcel.writeInt(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

}