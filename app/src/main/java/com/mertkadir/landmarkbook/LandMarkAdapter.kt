package com.mertkadir.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mertkadir.landmarkbook.databinding.RecyclerRowBinding

class LandMarkAdapter(val landmarkList : ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {

    class LandMarkHolder(val binding: RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandMarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
      holder.binding.recyclerTextView.text = landmarkList.get(position).name
        holder.itemView.setOnClickListener { val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }


}