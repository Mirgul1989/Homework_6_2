package com.example.homework_6_2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_6_2.adapter.ImageAdapter
import com.example.homework_6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        const val RESULT = "key"
    }

    private lateinit var adapter: ImageAdapter
    private var imageList = arrayListOf<String>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        adapter = ImageAdapter(imageList)
        binding.recycleView.adapter = adapter
        initClicker()
    }
    private fun initClicker() {
        with(binding) {
            btnSend.setOnClickListener {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(RESULT, adapter.getData())
                startActivity(intent)
            }
        }
    }

    private fun loadData() {
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://st3.depositphotos.com/7340112/15280/i/1600/depositphotos_152809206-stock-photo-mountain-peaks-in-cape-town.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/98/63/d6/9863d6c8548eca3e71b865a942dc10e3.jpg")
        imageList.add("https://i.pinimg.com/474x/ce/e1/bb/cee1bb54ff5a8c7051956b98513a64fa.jpg")
        imageList.add("https://i.pinimg.com/564x/77/d7/6f/77d76f9286c2f2bbf530f4da3b3f14be.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
        imageList.add("https://i.pinimg.com/474x/27/9b/42/279b42875142af1b587b2ec92d645d8c.jpg")
    }
}