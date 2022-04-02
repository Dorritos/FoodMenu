package com.dorritos.vakhitovtesttask.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dorritos.vakhitovtesttask.ui.fragments.ComboFragment
import com.dorritos.vakhitovtesttask.ui.fragments.DesertFragment
import com.dorritos.vakhitovtesttask.ui.fragments.DrinkFragment
import com.dorritos.vakhitovtesttask.ui.fragments.PizzaFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PizzaFragment()
            1 -> ComboFragment()
            2 -> DesertFragment()
            3 -> DrinkFragment()
            else -> PizzaFragment()
        }
    }

}