package com.example.mydzikirapplication.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivityDzikirPagiBinding
import com.example.mydzikirapplication.model.DzikirDoaData

class DzikirPagiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDzikirPagiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            rvDzikirPagi.layoutManager = LinearLayoutManager(this@DzikirPagiActivity)
            rvDzikirPagi.adapter = AdapterDoaDzikir(DzikirDoaData.listDzikirPagi)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}