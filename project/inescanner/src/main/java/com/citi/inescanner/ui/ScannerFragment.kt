package com.citi.inescanner.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.citi.inescanner.databinding.ScannerFragmentBinding

class ScannerFragment : Fragment() {

    private var _binding: ScannerFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ScannerFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initIdMissionSdk()
        startIdScan()
    }

    private fun initIdMissionSdk() {
        // TODO
    }

    private fun startIdScan() {
        // TODO
    }
}