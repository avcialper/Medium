package com.example.mediumviewbinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mediumviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)

            val user = User("avcialper", true)
            intent.putExtra("string", "medium")
            intent.putExtra("int", 99)
            intent.putExtra("user", user)

            startActivity(intent)
        }
    }
}