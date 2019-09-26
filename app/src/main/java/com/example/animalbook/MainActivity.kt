package com.example.animalbook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = titleFlagment as? TitleFragment
        fragment?.setTitle("フラグメント動物図鑑")

        nextbutton.setOnClickListener{
            val intent = Intent(this,SubActivity::class.java)
            startActivity(intent)
        }
    }
}
