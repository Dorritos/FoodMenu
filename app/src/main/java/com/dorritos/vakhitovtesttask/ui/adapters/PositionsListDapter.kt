package com.dorritos.vakhitovtesttask.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dorritos.vakhitovtesttask.R
import com.dorritos.vakhitovtesttask.api.models.MenuItem
import com.dorritos.vakhitovtesttask.utils.ImageLoader

class PositionsListDapter(private val dataSet: List<MenuItem>) : RecyclerView.Adapter<PositionsListDapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewPositionName: TextView = view.findViewById(R.id.textViewPositionName)
        val textViewPositionDetails: TextView = view.findViewById(R.id.textViewPositionDetails)
        val imageViewPositionImage: ImageView = view.findViewById(R.id.imageViewPositionImage)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.position_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.apply {
            textViewPositionName.text = dataSet[position].title
            textViewPositionDetails.text = dataSet[position].restaurantChain

            val imageUrl = dataSet[position].image
            ImageLoader.setImage(imageUrl, imageViewPositionImage)
        }
    }

    override fun getItemCount() = dataSet.size
}