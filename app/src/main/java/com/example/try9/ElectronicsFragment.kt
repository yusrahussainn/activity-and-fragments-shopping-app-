package com.example.try9

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button

class ElectronicsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_electronics, container, false)
        val viewDetailsButton: Button = view.findViewById(R.id.viewDetailsButton)

        viewDetailsButton.setOnClickListener {
            val intent = Intent(activity, ProductDetailActivity::class.java)
            intent.putExtra("product", "Latest Smartphone")
            intent.putExtra("productImage", R.drawable.phone)
            startActivity(intent)
        }

        return view
    }
}
