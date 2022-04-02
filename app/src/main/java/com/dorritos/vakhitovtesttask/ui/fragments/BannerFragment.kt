package com.dorritos.vakhitovtesttask.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dorritos.vakhitovtesttask.databinding.FragmentBannersBinding

class BannerFragment : Fragment() {
    private var _binding: FragmentBannersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentBannersBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
}