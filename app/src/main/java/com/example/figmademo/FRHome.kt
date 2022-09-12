package com.example.figmademo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.figmademo.databinding.FrHomeBinding

class FRHome : Fragment() {

    private lateinit var binding: FrHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FrHomeBinding.inflate(inflater, container, false)


        setAdapter()

        return binding.root
    }

    fun setAdapter() {
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvHome.layoutManager = layoutManager
        val cardList = CardHomeData.values().toList()
        val rvAdapter = RVHomeAdapter(cardList = cardList)
        binding.rvHome.adapter = rvAdapter

    }

}