package com.kotlinnavigationdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController



/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    private lateinit var btn:Button
    private lateinit var button3:Button
    private lateinit var button4:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.button)
        button3= view.findViewById(R.id.button3)
        button4= view.findViewById(R.id.button4)
        btn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", "I am Second Frg, from First Frag")
            findNavController().navigate(R.id.secondFragment2,bundle)
            //findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2,bundle)
        }
        button3.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", "I am Third Frg, from First Frag")
            //findNavController().navigate(R.id.thirdFragment,bundle)
            findNavController().navigate(R.id.action_firstFragment2_to_thirdFragment,bundle)
        }
        button4.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", "I am Fourth Frg, from First Frag")
            findNavController().navigate(R.id.fourthFragment,bundle)
            //findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2,bundle)
        }
    }
}