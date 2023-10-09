package com.example.mydzikirapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.adapter.AdapterDoaDzikir
import com.example.mydzikirapplication.databinding.ActivityDzikirPagiPetangBinding
import com.example.mydzikirapplication.model.DzikirDoaData
import com.example.mydzikirapplication.ui.detail.DzikirPagiActivity
import com.example.mydzikirapplication.ui.detail.DzikirPetangActivity

class DzikirPagiPetangActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDzikirPagiPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDzikirPagiPetangBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pagi dan Petang"
        binding.apply {
            cvDzikirPagi.setOnClickListener(this@DzikirPagiPetangActivity)
            cvDzikirPetang.setOnClickListener(this@DzikirPagiPetangActivity)
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi Petang"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.cv_dzikir_pagi -> {
                val intentDDS = Intent(this@DzikirPagiPetangActivity, DzikirPagiActivity::class.java)
                startActivity(intentDDS)
            }
            R.id.cv_dzikir_petang -> {
                val intentDDS = Intent(this@DzikirPagiPetangActivity, DzikirPetangActivity::class.java)
                startActivity(intentDDS)
            }

        }
    }
}