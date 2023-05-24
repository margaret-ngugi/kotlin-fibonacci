package com.example.fibonacciViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.fibonacciviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNumbersList()

        }
    fun displayNumbersList(){
        var range= listOf("1...100")
        binding.rvNumbers.layoutManager=GridLayoutManager(this,3)
        val nameAdapter=NumbersRvAdapter(range)
        binding.rvNumbers.adapter=nameAdapter

    }
}






