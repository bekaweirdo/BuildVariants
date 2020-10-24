package com.example.buildvariants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Client1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client1)
        Log.d("client1","Hello there")
        android.widget.Toast.makeText(this,"HELLO THERE, IT'S CLIENT 1", android.widget.Toast.LENGTH_SHORT).show()

    }
}