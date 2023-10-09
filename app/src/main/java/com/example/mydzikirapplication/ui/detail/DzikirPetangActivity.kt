package com.example.mydzikirapplication.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivityDzikirPagiBinding
import com.example.mydzikirapplication.databinding.ActivityDzikirPetangBinding
import com.example.mydzikirapplication.model.DzikirDoaData

class DzikirPetangActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDzikirPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            rvDzikirPetang.layoutManager = LinearLayoutManager(this@DzikirPetangActivity)
            rvDzikirPetang.adapter = AdapterDoaDzikir(DzikirDoaData.listDzikirPetang)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}