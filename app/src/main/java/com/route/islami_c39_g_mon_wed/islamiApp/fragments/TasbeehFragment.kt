package com.route.islami_c39_g_mon_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_g_mon_wed.R
import com.route.islami_c39_g_mon_wed.databinding.FragmentQuranBinding
import com.route.islami_c39_g_mon_wed.databinding.FragmentTasbeehBinding

class TasbeehFragment : Fragment() {

    private lateinit var binding: FragmentTasbeehBinding
    private var count = 0
    private lateinit var azkarList : MutableList<String>
    private var position = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasbeehBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        azkarList = resources.getStringArray(R.array.azkarArray).toMutableList()

        binding.currentValue.setOnClickListener {
            count = 0
            binding.currentValue.text = "$count"
        }

        binding.countUp.setOnClickListener {
            counter()
        }
        binding.sebhaBody.setOnClickListener{
            binding.sebhaBody.rotation += (360/33).toFloat()
            counter()
        }
    }
    private fun counter(){
        if (count < 3)
            count++
        else {
            count = 0

            position = if (position < azkarList.size -1 ) ++position else 0
            binding.countUp.text = azkarList[position]
        }
        binding.currentValue.text = "$count"


    }
}
