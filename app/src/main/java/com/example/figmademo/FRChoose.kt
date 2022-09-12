package com.example.figmademo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.figmademo.databinding.FrChooseBinding

class FRChoose : Fragment() {
    private lateinit var binding: FrChooseBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FrChooseBinding.inflate(inflater, container, false)
        val view = binding.root

        setAdapter()

        return view


    }

    fun setAdapter() {
        val layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.rvChoose.layoutManager = layoutManager
        val cardList = CardData.values().toList()
        val rvAdapter = RVAdapter(cardList = cardList)
        binding.rvChoose.adapter = rvAdapter

    }


}