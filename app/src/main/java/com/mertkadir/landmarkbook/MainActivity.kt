package com.mertkadir.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mertkadir.landmarkbook.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

private lateinit var landmarkList: ArrayList<LandMark>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landmarkList = ArrayList<LandMark>()


        //Data
        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","Italy",R.drawable.collesium)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = LandMark("London Bridge","UK",R.drawable.londan)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandMarkAdapter(landmarkList)
        binding.recyclerView.adapter = landMarkAdapter



    }
}