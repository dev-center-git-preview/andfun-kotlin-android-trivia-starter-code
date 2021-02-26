package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    private lateinit var binding: FragmentTitleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        setListeners(binding)
        return binding.root
    }

    private fun setListeners(binding: FragmentTitleBinding) {
        //binding.playButton.setOnClickListener {
            // Basic way to navigate: Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)

            // Second way that needs additional dependency declarations within the App gradle file:
            // 1. implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"
            // 2. implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"
            //view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        //}

        // Third way:
        val listener = Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        binding.playButton.setOnClickListener(listener)
    }
}