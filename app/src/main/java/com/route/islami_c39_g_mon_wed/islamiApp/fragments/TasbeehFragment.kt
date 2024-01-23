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
        var tasbehCounter = 1
        var tasbehListCounter = 0
        var rotationAngle = 5f
        Tasbeh = listOf("الله اكبر","الحمدلله","سبحان الله")
        binding.counter.text = "$tasbehCounter"

        binding.tasbeh.setOnClickListener{
            if (tasbehCounter in 1..32){
                binding.counter.text = "${tasbehCounter++}"

            }
            else if (tasbehCounter == 33) {
                tasbehCounter = 1
                binding.counter.text = "$tasbehCounter"
                if (tasbehListCounter == 3){
                    tasbehListCounter = 0
                    binding.tasbeh.text = Tasbeh[tasbehListCounter]
                }
                binding.tasbeh.text = Tasbeh[tasbehListCounter++]
            }
            rotationAngle+=5
            binding.body.rotation = rotationAngle
        }

    }
}
