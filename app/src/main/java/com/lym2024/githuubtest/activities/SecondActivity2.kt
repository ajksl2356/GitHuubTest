package com.lym2024.githuubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lym2024.githuubtest.R
import com.lym2024.githuubtest.databinding.ActivitySecond2Binding

class SecondActivity2 : AppCompatActivity() {

    lateinit var binding: ActivitySecond2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}