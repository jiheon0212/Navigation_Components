package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationcomponent.databinding.FragmentFourBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FourFragment : Fragment() {
    lateinit var fragmentFourBinding: FragmentFourBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentFourBinding = FragmentFourBinding.inflate(layoutInflater, container, false)
        val view = fragmentFourBinding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentFourBinding.btnLogout.setOnClickListener {
            activity?.findViewById<FragmentContainerView>(R.id.nav_host_fragment_main)?.visibility = View.VISIBLE
            activity?.findViewById<FragmentContainerView>(R.id.nav_host_fragment_sub)?.visibility = View.GONE
            activity?.findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)?.visibility = View.GONE

            val navController = (activity?.supportFragmentManager?.findFragmentById(R.id.nav_host_fragment_main) as NavHostFragment).navController
            navController.navigate(R.id.oneFragment)
        }
    }
}