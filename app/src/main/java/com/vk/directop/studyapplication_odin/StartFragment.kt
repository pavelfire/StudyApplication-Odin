package com.vk.directop.studyapplication_odin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.vk.directop.studyapplication_odin.databinding.FragmentStartBinding


class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentStartBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_start, container, false
        )

        Log.d("My log", "On Create View")
        binding.btSRS4.setOnClickListener {
            Log.d("My log", "btSRS4 pressed")
            this.findNavController().navigate(
                StartFragmentDirections.actionStartFragmentToConstraintLayoutFragment()    )
        }
        binding.bt2.setOnClickListener {
            this.findNavController().navigate(
                StartFragmentDirections.actionStartFragmentToFrameLayoutFragment()  )
        }
        binding.bt3.setOnClickListener {v: View ->
            v.findNavController().navigate(
                StartFragmentDirections.actionStartFragmentToLinearLayoutFragment()    )
        }
        binding.btSRS4.setOnClickListener {v: View ->
            v.findNavController().navigate(
                StartFragmentDirections.actionStartFragmentToTwentySixOctFragment()    )
        }






        return binding.root
    }


}