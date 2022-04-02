package com.dorritos.vakhitovtesttask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dorritos.vakhitovtesttask.databinding.FragmentComboBinding
import com.dorritos.vakhitovtesttask.ui.adapters.PositionsListDapter
import com.dorritos.vakhitovtesttask.ui.vm.PositionsViewModel

class ComboFragment : Fragment() {

    private var _binding: FragmentComboBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentComboBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recycler = binding.recyclerViewCombo
        recycler.layoutManager = LinearLayoutManager(requireContext())

        val menuViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(
            PositionsViewModel::class.java)
        menuViewModel.getCombo().observe(viewLifecycleOwner) { food ->
            food?.let {
                val adapter = PositionsListDapter(food.menuItems)
                recycler.adapter = adapter
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}