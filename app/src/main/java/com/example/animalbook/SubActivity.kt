package com.example.animalbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*


class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        birdbutton.setOnClickListener{
            val fragment = BirdFragment()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        monkybutton.setOnClickListener{
            val fragment = MonkyFragment()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        dogbutton.setOnClickListener{
            val fragment = dogFragment()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val fragment = titleFlagment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}
