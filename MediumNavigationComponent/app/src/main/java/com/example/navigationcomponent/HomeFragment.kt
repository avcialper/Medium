package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            homeFragmentButton.setOnClickListener {
                val game = Game("CS GO", 2012)
                /* Verilerin gönderieleceği ekranda geçiş fonksiyonu içerisine verileri ekliyoruz
                ardından bu parametreyi navigate içerisine atıyoruz. Gönderen sayfa directions türündedir */
                val directions = HomeFragmentDirections.goToGameFragment(game, "rash", 100, 1f, true)
                /* findNavController(it) butona tıklandığında NavController nesnesini oluşturur.
                Bu nesene sayesinde navigate işlemlerini gerçekleştirebiliriz. */
                Navigation.findNavController(it).navigate(directions)
            }
        }
    }
}