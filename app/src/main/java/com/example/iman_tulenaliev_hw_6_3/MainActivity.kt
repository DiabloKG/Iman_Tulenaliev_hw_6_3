package com.example.iman_tulenaliev_hw_6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iman_tulenaliev_hw_6_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vpMain.adapter = ViewPagerAdapter(this)
    }
}