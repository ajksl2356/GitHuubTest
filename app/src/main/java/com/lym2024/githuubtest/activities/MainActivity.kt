package com.lym2024.githuubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lym2024.githuubtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}