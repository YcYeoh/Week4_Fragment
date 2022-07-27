package com.example.week4fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.week4fragment.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_about, container, false)

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about, container,false)

        binding.aboutGoButton.setOnClickListener(){
            Navigation.findNavController(binding.root)
                .navigate(R.id.ActionAboutToNew)
        }

        return binding.root
    }


}