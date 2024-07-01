package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationcomponent.databinding.FragmentOneBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class OneFragment : Fragment() {
    lateinit var fragmentOneBinding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentOneBinding = FragmentOneBinding.inflate(layoutInflater, container, false)
        val view = fragmentOneBinding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentOneBinding.btnLogin.setOnClickListener {
            activity?.findViewById<FragmentContainerView>(R.id.nav_host_fragment_main)?.visibility = View.GONE
            activity?.findViewById<FragmentContainerView>(R.id.nav_host_fragment_sub)?.visibility = View.VISIBLE
            activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)?.visibility = View.VISIBLE

            val navController = (activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment_sub) as NavHostFragment).navController
            navController.navigate(R.id.twoFragment)
        }
    }
}