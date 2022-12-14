package com.example.attemptatautentification.possumLib

import android.graphics.Color
import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.RequiresApi
import java.io.Serializable

class Category constructor(name_: String = "новая категория", colour_: Int = 0) : Serializable/*, Parcelable*/ {
    companion object{
        var countId = 0;
    }
    var name: String = "новая категория"
        get() {
            return field
        }
        set(value) {
            if (value == "без категории") {
                field = ""
            } else if (value.length in 0..19) {
                field = value
            }
        }

    var colour: Int = countId++
        get() {
            return field
        }
        set(value) {
            field = value
        }

//    constructor(parcel: Parcel) : this(
//            TODO("name_"),
//            TODO("colour_")) {
//    }

    init {
        name = if (name_ == "без категории") {
            ""
        } else {
            name_
        }
        colour = colour_
    }

//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Category> {
//        override fun createFromParcel(parcel: Parcel): Category {
//            return Category(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Category?> {
//            return arrayOfNulls(size)
//        }
//    }
}