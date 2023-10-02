package com.example.navigationcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding
    private val args : GameFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            getData.text = """
                Kullanıcı Adı: ${args.username}
                Level: ${args.level}
                KDA: ${args.kda}
                Çevrimiçi: ${args.isPlaying}
                Oyun: ${args.game.name}
                Yayın Tarihi: ${args.game.releaseDate}
            """.trimIndent()

            gameFragmentButton.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.goToEndFragment)
            }
        }
    }
}