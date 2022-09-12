package com.example.figmademo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.figmademo.R
import com.example.figmademo.databinding.FrLoginBinding

class FRLogin : Fragment() {

    private lateinit var binding: FrLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FrLoginBinding.inflate(inflater, container, false)

        navigateToStarted()

        return binding.root
    }

    private fun navigateToStarted() {
        binding.ivGoogle.setOnClickListener {
            it.findNavController().navigate(R.id.action_FRLogin_to_FRStarted2)
        }
    }
}