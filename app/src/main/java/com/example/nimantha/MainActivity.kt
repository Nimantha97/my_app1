package com.example.nimantha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nimantha.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityMainBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}