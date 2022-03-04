package com.example.delire.splashscreen

import android.content.Context
import android.graphics.Color
import kotlinx.android.synthetic.main.activity_main.view.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.delire.R
import kotlinx.android.synthetic.main. activity_main.*

class MainActivity : AppCompatActivity() {

    private var partnerProfilePic = listOf(
        R.drawable.profile_picture1,
        R.drawable.profile_picture2,
        R.drawable.profile_picture3,
        R.drawable.profile_picture4,
        R.drawable.profile_picture5,
        R.drawable.profile_picture6,
        R.drawable.profile_picture7,
        R.drawable.profile_picture8,
        R.drawable.profile_picture9,)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gymButton1.setOnClickListener{
            fillpatnersSlots();
            gymButton1.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.splash_color_background));
            gymButton1.setTextColor(ContextCompat.getColor(this, R.color.black));
            gymButton2.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton2.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
            gymButton3.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton3.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
        }

        gymButton2.setOnClickListener{
            fillpatnersSlots();
            gymButton1.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton1.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
            gymButton2.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.splash_color_background));
            gymButton2.setTextColor(ContextCompat.getColor(this, R.color.black));
            gymButton3.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton3.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
        }

        gymButton3.setOnClickListener{
            fillpatnersSlots();
            gymButton1.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton1.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
            gymButton2.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.delire_light_gray));
            gymButton2.setTextColor(ContextCompat.getColor(this, R.color.delire_dark_gray));
            gymButton3.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.splash_color_background));
            gymButton3.setTextColor(ContextCompat.getColor(this, R.color.black));
        }

    }

    public fun fillpatnersSlots(){

        var partnerSlots = arrayOf(
            matchingDot1,
            matchingDot2,
            matchingDot3,
            matchingDot4,
            matchingDot5,
            matchingDot6,
            matchingDot7,
            matchingDot8,
            matchingDot9,)

        for (slot in partnerSlots){
            slot.setImageResource(partnerProfilePic.random())
        }
    }
}


