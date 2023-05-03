package com.kotlinnavigationdemo.ex2_bottommenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.kotlinnavigationdemo.R
import com.kotlinnavigationdemo.ex3_navdrawer.MyViewModel

class AccountFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }
      val viewModel: MyViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn :Button = view.findViewById(R.id.btn)
        viewModel.setTitle("Accounts")
        btn.setOnClickListener {
            findNavController().navigate(R.id.favoritesFragment)
        }
    }

}