package com.kotlinnavigationdemo.ex2_bottommenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.kotlinnavigationdemo.R
import com.kotlinnavigationdemo.ex3_navdrawer.MyViewModel


class AlbumsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_albums, container, false)
    }
    val viewModel: MyViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setTitle("Album")
        val rv:RecyclerView = view.findViewById(R.id.rv)
        var list = arrayListOf<String>()
        list.add("ABC")
        list.add("XYD")
        rv.adapter = MyAdapter(list)
    }

}