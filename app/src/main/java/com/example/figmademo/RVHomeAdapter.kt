package com.example.figmademo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_item_home.view.*

class RVHomeAdapter(private val cardList: List<CardHomeData>) : RecyclerView
.Adapter<RVHomeAdapter
.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.row_item_home,
                parent,
                false)

        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.itemView.apply {
            tvRowItemHome.text = cardList[position].titleResId
            ivRowItemHome.setImageResource(cardList[position].imgResId)
            tvRowItemHome.setTextColor(ContextCompat.getColor(context,
                    cardList[position].textColorResId))
            tvRowItemHome.typeface = ResourcesCompat.getFont(context,
                    cardList[position].titleFontResId)
        }
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}