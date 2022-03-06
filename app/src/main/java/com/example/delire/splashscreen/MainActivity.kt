package com.example.delire.splashscreen

import android.media.Image
import kotlinx.android.synthetic.main.activity_main.view.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.example.delire.R
import com.mikhaellopez.circularimageview.CircularImageView
import kotlinx.android.synthetic.main. activity_main.*

class MainActivity : AppCompatActivity() {

    var partnerSlots = arrayOf<CircularImageView>();

    var user1 = Partners(R.drawable.profile_picture1, "Elsiiie", "Elsie", "Pearson", "",true, false)
    var user2 = Partners(R.drawable.profile_picture2, "Dydy", "Dylan", "Anderson", "",true, true)
    var user3 = Partners(R.drawable.profile_picture3, "Emery", "Emery", "Misenar", "",false, false)
    var user4 = Partners(R.drawable.profile_picture4, "Tommy", "Tom", "Keel", "",true, true)
    var user5 = Partners(R.drawable.profile_picture5, "Angus", "Angelo", "Gustas", "",false, false)
    var user6 = Partners(R.drawable.profile_picture6, "Maesher", "Mae", "Sherrer", "",true, true)
    var user7 = Partners(R.drawable.profile_picture7, "Luperillion", "Lupe", "Tarrillion", "",true, false)
    var user8 = Partners(R.drawable.profile_picture8, "Zar", "Zarda", "Deziel", "",true, true)
    var user9 = Partners(R.drawable.profile_picture9, "ArtL", "Art", "Leers", "",true, false)
    var user10 = Partners(R.drawable.profile_picture10, "Samtrox", "Samual", "Troxler", "",true, false)

    private var userList = listOf(
        user1, user2, user3, user4, user5, user6, user7, user8, user9, user10
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        partnerSlots = arrayOf(
            matchingDot1,
            matchingDot2,
            matchingDot3,
            matchingDot4,
            matchingDot5,
            matchingDot6,
            matchingDot7,
            matchingDot8,
            matchingDot9,)

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

        filterButton.setOnClickListener{
            var filterViewvisibility = filterView.visibility;

            if (filterViewvisibility == View.GONE){
                filterView.visibility = View.VISIBLE
                partnerView.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.black_transparent_bg));
                for (slot in partnerSlots){
                    slot.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.black_transparent_bg));
                    slot.alpha = 0f
                }
            }else {
                filterView.visibility = View.GONE
                partnerView.setBackgroundTintList(null);
                for (slot in partnerSlots){
                    slot.setBackgroundTintList(null);
                    slot.alpha = 1f
                }
            }
        }

        closeFilterButton.setOnClickListener{
            filterView.visibility = View.GONE
            partnerView.setBackgroundTintList(null);
            for (slot in partnerSlots){
                slot.setBackgroundTintList(null);
                slot.alpha = 1f
            }
        }
    }

    public fun fillpatnersSlots(){
        for (slot in partnerSlots){
            slot.setImageResource(userList.random().profilePicture)
        }
    }
}

class Partners(
    val profilePicture: Int,
    val username: String,
    val firstname: String,
    val lastName: String,
    val middleName: String,
    val leadCertified: Boolean,
    val topRopeCertified: Boolean
    ){

}


