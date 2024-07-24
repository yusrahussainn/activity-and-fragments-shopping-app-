package com.example.try9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var showElectronicsFragmentButton: Button
    private lateinit var showClothingFragmentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showElectronicsFragmentButton = findViewById(R.id.showElectronicsFragmentButton)
        showClothingFragmentButton = findViewById(R.id.showClothingFragmentButton)

        showElectronicsFragmentButton.setOnClickListener {
            replaceFragment(ElectronicsFragment())
        }

        showClothingFragmentButton.setOnClickListener {
            replaceFragment(ClothingFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
