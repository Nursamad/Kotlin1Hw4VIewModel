package com.example.test.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.test.databinding.FragmentThirdBinding
import com.example.test.ui.viewModels.OurViewModel

class ThirdFragment : Fragment() {

    private val viewModel: OurViewModel by activityViewModels()
    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.add.observe(activity as LifecycleOwner, {
            binding.tvArchive.text = it.toString()
            .replace(",", "")
            .replace("[", "")
            .replace("]", "")
            .trim()
        })
    }
}