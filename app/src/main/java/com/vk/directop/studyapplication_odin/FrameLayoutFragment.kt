package com.vk.directop.studyapplication_odin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.vk.directop.studyapplication_odin.databinding.FragmentFrameLayoutBinding
import com.vk.directop.studyapplication_odin.databinding.FragmentStartBinding

class FrameLayoutFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentFrameLayoutBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_frame_layout, container, false
        )

        Log.d("My log", "On Create View")
        binding.btGenerate.setOnClickListener {
            //binding.bt1.text = "fgf"
            Log.d("My log", "bt1 pressed")
            this.findNavController().navigate(
                FrameLayoutFragmentDirections.actionFrameLayoutFragmentToTwentySixOctFragment())
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}