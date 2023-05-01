package com.example.iman_tulenaliev_hw_6_3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.iman_tulenaliev_hw_6_3.PageViewModel
import com.example.iman_tulenaliev_hw_6_3.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: PageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initModel()
        initViews()
    }

    private fun initModel() {
        viewModel = ViewModelProvider(requireActivity())[PageViewModel::class.java]
    }

    private fun initViews() {
        viewModel.operation.observe(viewLifecycleOwner) {
            binding.tvOperation.text = it.toString()
        }
    }
}