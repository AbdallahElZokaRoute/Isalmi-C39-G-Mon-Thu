package com.route.islami_c39_g_mon_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_g_mon_wed.databinding.FragmentTasbeehBinding

class TasbeehFragment : Fragment() {

    private lateinit var binding: FragmentTasbeehBinding
    private lateinit var Tasbeh : List<String>
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
        var num = 1
        var i = 0
        Tasbeh = listOf("الله اكبر","الحمدلله","سبحان الله")
        binding.counter.text = "$num"
        binding.tasbeh.setOnClickListener{
            if (num in 1..32){
                binding.counter.text = "${num++}"
            }
            else if (num == 33) {
                num = 1
                binding.counter.text = "$num"
                if (i == 3){
                    i = 0
                    binding.tasbeh.text = Tasbeh[i]
                }
                binding.tasbeh.text = Tasbeh[i++]
            }
        }

    }
}
