package com.example.mydzikirapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivitySunnahQauliyahBinding
import com.example.mydzikirapplication.model.DzikirDoaData

class SunnahQauliyahActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySunnahQauliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQauliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah Sunnah Qouliah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQauliyahActivity)
            rvQauliyahShalat.adapter = AdapterDoaDzikir(DzikirDoaData.listQauliyah)
        }


        }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}