package com.route.islami_c39_g_mon_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_g_mon_wed.databinding.FragmentTasbeehBinding
import com.route.islami_c39_g_mon_wed.islamiApp.data.tsbeeha

class TasbeehFragment : Fragment() {

    lateinit var binding: FragmentTasbeehBinding

    private var tsbeha = tsbeeha
    private var counter = 0

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


        onTasbeehaTvClick()
    }

    private fun onTasbeehaTvClick() {

        binding.tsbeeha.setOnClickListener {

            binding.countNumber.text = counter.toString()

            when (counter) {

                in 0..33 -> {
                    counter++
                    binding.tsbeeha.text = tsbeha[0]
                    binding.seb7a.rotation += 11f
                }

                in 34..66 -> {
                    counter++
                    binding.tsbeeha.text = tsbeha[1]
                    binding.seb7a.rotation += 11f
                }

                in 67..99 -> {
                    counter++
                    binding.tsbeeha.text = tsbeha[2]
                    binding.seb7a.rotation += 11f
                }

                100 -> {
                    binding.tsbeeha.text = tsbeha[3]
                    binding.seb7a.rotation = 0F
                }

                else -> {
                    binding.tsbeeha.text = tsbeha[0]
                    binding.seb7a.rotation = 0F
                }

            }


        }

    }
}
