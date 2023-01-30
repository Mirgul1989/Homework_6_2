package com.example.homework_6_2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_6_2.ui.MainActivity.Companion.RESULT
import com.example.homework_6_2.adapter.ImageAdapter
import com.example.homework_6_2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var adapter: ImageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = ImageAdapter(arrayListOf())
        binding.recyclerView.adapter=adapter
        val data = intent.getStringArrayListExtra(RESULT)
        if (data != null)
            adapter.addList(data)
    }
}