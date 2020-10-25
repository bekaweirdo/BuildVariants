package com.example.buildvariants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = getString(R.string.client_name)
        btn.setOnClickListener {
            val intent = Intent(this, ClientActivity::class.java)
            val bundle = Bundle()
            bundle.putString("clientName", clientName.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}