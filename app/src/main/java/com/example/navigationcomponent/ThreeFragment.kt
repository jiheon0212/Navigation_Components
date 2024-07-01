package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {
    lateinit var fragmentThreeBinding: FragmentThreeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentThreeBinding = FragmentThreeBinding.inflate(layoutInflater, container, false)
        val view = fragmentThreeBinding.root
        return view
    }
}