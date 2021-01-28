package com.malkinfo.recyclerviewdemo.uitle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.malkinfo.recyclerviewdemo.R
import com.malkinfo.recyclerviewdemo.databinding.ItemFruitsBinding
import com.malkinfo.recyclerviewdemo.model.FruitsData

class FruitsAdapter(private val fruitsList:List<FruitsData>):RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>()
{
    /**and change data */
    /** it is automatically generate class*/
    /**ok run it*/
   /** now it is set*/
    inner class FruitsViewHolder(val v:ItemFruitsBinding):RecyclerView.ViewHolder(v.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
       val infalter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemFruitsBinding>(infalter,R.layout.item_fruits,parent,false)
        return FruitsViewHolder(v)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        val fruitsLists = fruitsList[position]
        holder.v.isFruitsList = fruitsLists
        holder.v.fruitImg.setImageResource(fruitsLists.fruitsImg)
    }

    override fun getItemCount(): Int {
       return fruitsList.size
    }
}