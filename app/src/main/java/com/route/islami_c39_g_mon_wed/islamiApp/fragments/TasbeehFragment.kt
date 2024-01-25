package com.route.islami_c39_g_mon_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_g_mon_wed.databinding.FragmentQuranBinding
import com.route.islami_c39_g_mon_wed.databinding.FragmentTasbeehBinding

class TasbeehFragment : Fragment() {

    lateinit var binding: FragmentTasbeehBinding
    var counter =0
    var counters =0
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
        binding.bodySebha.setOnClickListener{
            binding.bodySebha.rotation+=33F
            counter++

            binding.tsbeehCounter.setText(counter.toString())
            if (counter<=30){
                binding.tsbeeh.setText("سبحان الله")
            }
            else if (counter>30&&counter<=60){
                binding.tsbeeh.setText("الحمداالله")
            }
            else if (counter>60&&counter<=90){
                binding.tsbeeh.setText("الله اكبر")
            }
            else if (counter>90&&counter<=120){
                binding.tsbeeh.setText("لا اله الا الله  ")



            }
            else{
                counter=0

            }







        }

    }
}
