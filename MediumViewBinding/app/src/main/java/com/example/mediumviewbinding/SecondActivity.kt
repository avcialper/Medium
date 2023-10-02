package com.example.mediumviewbinding

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.mediumviewbinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val incommingString = intent.getStringExtra("string")
        val incommingInt = intent.getIntExtra("int", 0)
        val incommingObject = intent.getParcelableExtra("user", User::class.java)

        binding.stringVal.text = incommingString
        binding.intVal.text = incommingInt.toString()
        binding.objectString.text = incommingObject?.username
        binding.objectBool.text = incommingObject?.isOnline.toString()
    }
}