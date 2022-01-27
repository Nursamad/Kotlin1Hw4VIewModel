package com.example.test.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.test.databinding.FragmentFirstBinding
import com.example.test.ui.viewModels.OurViewModel

class FirstFragment : Fragment() {

    private val viewModel: OurViewModel by activityViewModels()
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        binding.btnPlus.setOnClickListener {
            viewModel.onAddClick()
        }
        binding.btnMinus.setOnClickListener {
            viewModel.onMinusClick()
        }
    }

}