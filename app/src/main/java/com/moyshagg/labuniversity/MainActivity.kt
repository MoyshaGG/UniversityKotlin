package com.moyshagg.labuniversity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import com.moyshagg.labuniversity.databinding.ActivityMainBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.security.Provider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val buttonChange = binding.buttonChangeText
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        viewModel.txt.observe(this, Observer{
            binding.textViewChange.text = it.toString()
        })
        buttonChange.setOnClickListener(){
            viewModel.changeFun()
        }
    }

}