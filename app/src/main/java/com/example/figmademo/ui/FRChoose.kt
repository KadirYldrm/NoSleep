package com.example.figmademo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.figmademo.adapter.RVAdapter
import com.example.figmademo.databinding.FrChooseBinding
import com.example.figmademo.enumtype.CardData

class FRChoose : Fragment() {
    private lateinit var binding: FrChooseBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FrChooseBinding.inflate(inflater, container, false)

        setAdapter()

        return binding.root
    }

    private fun setAdapter() {
        val layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.rvChoose.layoutManager = layoutManager
        val cardList = CardData.values().toList()
        val rvAdapter = RVAdapter(cardList = cardList)
        binding.rvChoose.adapter = rvAdapter

    }
}