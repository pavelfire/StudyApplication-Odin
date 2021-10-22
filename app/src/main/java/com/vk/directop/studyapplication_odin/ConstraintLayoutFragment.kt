package com.vk.directop.studyapplication_odin

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.vk.directop.studyapplication_odin.databinding.FragmentConstraintLayoutBinding


class ConstraintLayoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentConstraintLayoutBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_constraint_layout, container, false
        )

        var changeColor: Int = 0
        binding.button.setOnClickListener {

            if (changeColor.mod(2) == 0)
                binding.button.setBackgroundColor(Color.GREEN)
            else
                binding.button.setBackgroundColor(Color.TRANSPARENT)
            changeColor += 1
        }
        binding.button2.setOnClickListener {
            if (changeColor.mod(2) == 0) {
                binding.tvUpper.setBackgroundColor(Color.MAGENTA)
                binding.tvUpper.setTextColor(Color.BLACK)
            }else{
                binding.tvUpper.setBackgroundColor(Color.BLUE)
                binding.tvUpper.setTextColor(Color.LTGRAY)
            }
            changeColor += 1
        }

        return binding.root
    }


}