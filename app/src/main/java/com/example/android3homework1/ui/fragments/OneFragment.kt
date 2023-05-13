package com.example.android3homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android3homework1.data.OneModel
import com.example.android3homework1.databinding.FragmentOneBinding
import com.example.android3homework1.ui.adapters.OneFragmentAdapter

class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding
    private lateinit var viewModel: OneFragmentViewModel
    private var oneAdapter = OneFragmentAdapter(this::onItemClick)

    private fun onItemClick(args : OneModel) {
        findNavController().navigate(OneFragmentDirections.actionOneFragmentToDetailFragment(args))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this)[OneFragmentViewModel::class.java]
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setUpListener()
        setUpObserves()
    }

    private fun initialize() {
        binding.recyclerViewOneFragment.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = oneAdapter
        }
    }

    private fun setData() {
       viewModel.data.observe(viewLifecycleOwner){ data ->
           oneAdapter.setList(data)
       }
    }

    private fun setUpListener() {
        binding.recyclerViewOneFragment.isVisible = false
        binding.showButton.setOnClickListener {
                binding.showButton.isVisible = false
            binding.recyclerViewOneFragment.isVisible = true
            }
    }

    private fun setUpObserves() {
        setData()
    }
}