package com.example.attemptatautentification

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import kotlin.collections.ArrayList
import com.example.attemptatautentification.possumLib.Category
import com.example.attemptatautentification.possumLib.Plan
import com.example.attemptatautentification.possumLib.User
import java.util.*


class MainActivity : AppCompatActivity() {
    private var newUser: User = User()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       getSaved()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    public override fun onStart() {
        super.onStart()
    }

    @RequiresApi(Build.VERSION_CODES.O)
     fun exampleUser() {
        val catList: ArrayList<Category> = arrayListOf()
        val newList: ArrayList<Plan> = arrayListOf()
        newUser = User("Dead", newList, catList)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getSaved() {
        try {
            val sharedPref = this.getSharedPreferences("User_saved", MODE_PRIVATE) ?: return
            val gson = GsonBuilder().create()

            newUser = gson.fromJson(sharedPref.getString("User", ""), User::class.java)

                passed_user = newUser
        }catch(e: Exception){

        }
        val randomIntent = Intent(this, BottomNavigationScreen::class.java)
        startActivity(randomIntent)
    }

    private fun save() {
        val sharedPref = this.getSharedPreferences("User_saved", MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            val data = newUser
            val gson = GsonBuilder().create()
            putString("User", gson.toJson(data))
            apply()
        }
    }

    override fun onPause() {
        save()
        super.onPause()
    }
}



