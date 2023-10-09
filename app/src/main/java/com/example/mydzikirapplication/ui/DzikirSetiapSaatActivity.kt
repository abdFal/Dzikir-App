package com.example.mydzikirapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivityDzikirSetiapSaatBinding
import com.example.mydzikirapplication.model.DzikirDoaData

class DzikirSetiapSaatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDzikirSetiapSaatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDzikirSetiapSaatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Whenever You Are"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirSetiapSaatActivity)
            rvDzikirSetiapSaat.adapter = AdapterDoaDzikir(DzikirDoaData.listDzikir)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}