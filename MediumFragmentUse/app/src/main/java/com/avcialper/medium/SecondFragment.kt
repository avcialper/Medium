package com.avcialper.medium

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.avcialper.medium.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    // SecondFragment içerisine gelen verileri yakalama
    private val args : SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            // Gelen verileri alma
            val usernameArgs = args.user.username
            val emailArgs = args.email
            val birthYearArgs = args.birthYear
            val passwordArgs = args.user.password

            username.text = "Kullanıcı Adı: $usernameArgs"
            email.text = "Kullanıcı Adı: $emailArgs"
            birthYear.text = "Kullanıcı Adı: $birthYearArgs"
            password.text = "Kullanıcı Adı: $passwordArgs"

            button.setOnClickListener {

                // Tetiklenecek olan action
                val directions = SecondFragmentDirections.actionSecond()

                // Ekran değişiminin gerçekleşmesini sağlayacak kod
                Navigation.findNavController(it).navigate(directions)

            }

        }

    }

}