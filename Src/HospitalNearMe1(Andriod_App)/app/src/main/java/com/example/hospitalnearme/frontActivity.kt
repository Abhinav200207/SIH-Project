package com.example.hospitalnearme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hospitalnearme.R

class FrontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        val image = findViewById<ImageView>(R.id.splashView);

        image.alpha= 0f;
        image.animate().setDuration(1500).alpha(1f).withEndAction{
            val i= Intent(this, MapsActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

        }
    }
}