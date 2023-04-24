package com.mertkadir.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertkadir.landmarkbook.databinding.ActivityDetailsBinding

private lateinit var binding: ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting
        val selectedLandMark = intent.getSerializableExtra("landmark") as LandMark

        binding.nameText.text = selectedLandMark.name
        binding.countryText.text = selectedLandMark.country
        binding.imageView.setImageResource(selectedLandMark.image)
    }
}