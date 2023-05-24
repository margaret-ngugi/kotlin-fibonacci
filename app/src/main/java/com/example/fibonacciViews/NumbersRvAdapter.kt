package com.example.fibonacciViews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.fibonacciviews.R

class NumbersRvAdapter(var fibonacciNumbers:List<String>):RecyclerView.Adapter<NumbersViewsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewsHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_numbers,parent,
        false)
        return NumbersViewsHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersViewsHolder, position: Int) {
        var currentNumbers=fibonacciNumbers.get(position)
        holder.tvNumbers.text=currentNumbers
    }

    override fun getItemCount(): Int {
        return fibonacciNumbers.size

    }
}
class NumbersViewsHolder(item:View):ViewHolder(item){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNum)

}
