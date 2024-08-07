package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationcomponent.databinding.FragmentTwoBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class TwoFragment : Fragment() {
    lateinit var fragmentTwoBinding: FragmentTwoBinding
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTwoBinding = FragmentTwoBinding.inflate(layoutInflater, container, false)
        val view = fragmentTwoBinding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomNavigationView = activity?.findViewById(R.id.bottom_navigation_bar)!!
        bottomNavigationView.setupWithNavController(findNavController())
    }
}