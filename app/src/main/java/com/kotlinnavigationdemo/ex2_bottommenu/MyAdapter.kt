package com.kotlinnavigationdemo.ex2_bottommenu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kotlinnavigationdemo.R

class MyAdapter(list :List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    private lateinit var list :List<String>
    init {
        this.list = list
    }
    var navController: NavController? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_albums, parent, false)
       return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tv.setText(list.get(position))
        holder.tv.setOnClickListener{
           Navigation.findNavController(holder.tv).navigate(R.id.favoritesFragment)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    public class MyViewHolder(itemView: View) : ViewHolder(itemView){
        lateinit var tv : TextView
        init {
            tv = itemView.findViewById(R.id.alName)
        }
    }
}