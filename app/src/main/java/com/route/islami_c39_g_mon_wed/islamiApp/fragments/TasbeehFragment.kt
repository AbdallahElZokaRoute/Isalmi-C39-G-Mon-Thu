package com.route.islami_c39_g_mon_wed.islamiApp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.route.islami_c39_g_mon_wed.R
import com.route.islami_c39_g_mon_wed.databinding.FragmentTasbeehBinding


class TasbeehFragment : Fragment() {

    private var currentRotation = 0f
    private val rotationIncrement = 11f
    private val tasbeehat = listOf(getString(R.string.sobhanAllah),getString(R.string.alhamdLellah),getString(R.string.AllahAkbar))
    private var currentIndex = 0
    private var counter = 0


    lateinit var binding: FragmentTasbeehBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTasbeehBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (counter <= 33) {
            binding.btnTasbeeh.setOnClickListener {
                counter++
                rotateMisbaha()
                binding.tvTasbeehCounter.text = "$counter"
                if (counter == 33) {
                    currentIndex++
                    changeTasbeeh()

                }
            }
        }

    }

    private fun changeTasbeeh() {
        if (currentIndex <= 2) {
            counter = 0
            currentRotation = 0f
            changeButtonName(currentIndex)
        } else {
            counter = 0
            currentIndex = 0
            changeButtonName(currentIndex)
        }
    }


    private fun rotateMisbaha() {
        currentRotation += rotationIncrement
        binding.ivBodeyOfSebha.rotation = currentRotation
    }

    private fun changeButtonName(index: Int) {
        binding.btnTasbeeh.text = tasbeehat[index]
    }
}
