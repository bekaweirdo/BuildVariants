package com.example.buildvariants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.client2.activity_client.*

class ClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)
        val intent = intent.extras
        client2Name.text = intent?.getString("clientName")
        Glide.with(this)
            .load("https://moodle.htwchur.ch/pluginfile.php/124614/mod_page/content/4/example.jpg")
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .into(image)

    }
}