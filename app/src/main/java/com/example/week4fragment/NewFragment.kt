package com.example.week4fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.week4fragment.databinding.FragmentNewBinding

class NewFragment : Fragment() {

    private lateinit var binding:FragmentNewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_new, container, false)

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_new, container,false)

        binding.BackHomeButton.setOnClickListener(){
            Navigation.findNavController(binding.root).popBackStack()

        }

        return binding.root
    }


}