package com.example.figmademo.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.figmademo.R
import com.example.figmademo.enumtype.CardData
import kotlinx.android.synthetic.main.row_item.view.*

class RVAdapter(private val cardList: List<CardData>) : RecyclerView.Adapter<RVAdapter.CardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_item,
                parent,
                false)
        return CardViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        holder.itemView.apply {

            tvImprove.text = cardList[position].titleResId
            ivImprove.setImageResource(cardList[position].imgResId)
            llRowItem.setBackgroundResource(cardList[position].bgResId)
            tvImprove.setTextColor(ContextCompat.getColor(context,
                    cardList[position].textColorResId))
            tvImprove.typeface = ResourcesCompat.getFont(context,
                    cardList[position].titleFontResId)

            llRowItem.setOnClickListener {
                it.findNavController().navigate(R.id.action_FRChoose_to_FRHome)
            }
        }
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }


}