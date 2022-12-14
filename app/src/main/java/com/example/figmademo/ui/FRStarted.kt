package com.example.figmademo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.figmademo.R
import com.example.figmademo.databinding.FrStartedBinding

class FRStarted : Fragment() {

    private lateinit var binding: FrStartedBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FrStartedBinding.inflate(inflater, container, false)

        navigateToChoose()

        return binding.root

    }

    private fun navigateToChoose() {
        binding.ivGetStarted.setOnClickListener {
            it.findNavController().navigate(R.id.action_FRStarted_to_FRChoose)
        }
    }
}