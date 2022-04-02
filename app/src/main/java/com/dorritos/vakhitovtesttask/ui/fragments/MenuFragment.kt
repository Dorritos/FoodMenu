package com.dorritos.vakhitovtesttask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dorritos.vakhitovtesttask.databinding.FragmentMenuBinding
import com.dorritos.vakhitovtesttask.ui.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    val categories = arrayOf("Pizza", "Combo", "Deserts", "Drinks")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val tabLayoutCategories = binding.tabLayoutCategories
        val viewPagerCategories = binding.viewPagerCategories
        viewPagerCategories.adapter = ViewPagerAdapter(requireFragmentManager(), lifecycle)

        TabLayoutMediator(tabLayoutCategories, viewPagerCategories) { tab, position ->
            tab.text = categories[position]
        }.attach()

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}