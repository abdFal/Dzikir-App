package com.example.mydzikirapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivityDoaHarianBinding
import com.example.mydzikirapplication.model.DoaDzikirModel
import com.example.mydzikirapplication.model.DzikirDoaData

class DoaHarianActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoaHarianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Doa Harian"

        val descDzikir = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafazDzikir = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahDzikir = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val listDoa: ArrayList<DoaDzikirModel> = ArrayList()

        for (data in descDzikir.indices) {
            val dzikir = DoaDzikirModel(
                descDzikir[data],
                lafazDzikir[data],
                terjemahDzikir[data]
            )
            listDoa.add(dzikir)
        }

        val adapter = AdapterDoaDzikir(listDoa)
        val rvDzikirDoaHarian = binding.rvDzikirDoaHarian
        rvDzikirDoaHarian.adapter = adapter
        rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
