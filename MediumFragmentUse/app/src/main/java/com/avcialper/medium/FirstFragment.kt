package com.avcialper.medium

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.avcialper.medium.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            button.setOnClickListener {

                // Kullanıcı verilerini alma
                val username = username.text.toString()
                val email = email.text.toString()
                val birthYear = birthYear.text.toString().toInt()
                val password = password.text.toString().toInt()

                val user = User(username, password)

                // Tetiklenecek olan action
                val directions = FirstFragmentDirections.actionFirst(user, birthYear, email)

                // Ekran değişiminin gerçekleşmesini sağlayacak kod
                Navigation.findNavController(it).navigate(directions)

            }

        }

    }

}