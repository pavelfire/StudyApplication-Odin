package com.vk.directop.studyapplication_odin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.vk.directop.studyapplication_odin.databinding.FragmentTwentySixOctBinding
import kotlin.random.Random


class TwentySixOctFragment : Fragment() {

    lateinit var binding: FragmentTwentySixOctBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_twenty_six_oct, container, false
        )

        randomize()

        Log.d("My log", "On Create View")
        binding.btGenerate.setOnClickListener {
            randomize()
        }

        binding.btShowLetters.setOnClickListener {
            if(binding.rb1.isChecked){
                binding.etShowLetters.setText(showLetters(0, 1).toString())
            }
            else if(binding.rb2.isChecked){
                binding.etShowLetters.setText(showLetters(0,2).toString())
            }
            else if(binding.rb3.isChecked){
                binding.etShowLetters.setText(showLetters(1, 2).toString())
            } else {
                needCheckRadioBox()
                binding.etShowLetters.setText("Сначала выберите, какие буквы")

            }
        }
        return binding.root
    }

    private fun randomize() {
        binding.tv1.text = Random.nextInt(100).toString()

    }

    private fun showLetters(startLetter: Int , stepInFor: Int ): String {//MutableList<Char> {
        //var result = mutableListOf<Char>()
        var result = ""
        var letter: Char = 'a'
        var letters = mutableListOf<Char>()
        while(letter <= 'z') {
            letters.add(letter)
            ++letter
        }
        for (i in startLetter until letters.size step stepInFor){
            //result.add(letters[i])
            result += letters[i] + " "
        }
        return result
    }
    private fun needCheckRadioBox() {
        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("")
        builder.setMessage("Необходимо выбрать вы хотите увидеть все буквы или отдельно чётные или нечётные")
        builder.setPositiveButton("ОК") { dialog, which ->

        }
        builder.setNegativeButton("") { dialog, which ->
            //action if no pressed
        }
        builder.setNeutralButton("") { dialog, which ->

        }
        builder.show()
    }

}