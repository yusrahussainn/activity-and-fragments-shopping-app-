package com.example.try9

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetailTextView: TextView = findViewById(R.id.productDetailTextView)
        val product = intent.getStringExtra("product")
        val imageResId = intent.getIntExtra("productImage", -1)
        if (imageResId != -1) {
            val imageView = findViewById<ImageView>(R.id.imageViewProduct)
            imageView.setImageResource(imageResId)
        }
        productDetailTextView.text = product
    }
}
