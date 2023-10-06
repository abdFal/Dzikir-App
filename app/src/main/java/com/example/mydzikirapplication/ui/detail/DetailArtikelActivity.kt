package com.example.mydzikirapplication.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.example.mydzikirapplication.R
import com.example.mydzikirapplication.databinding.ActivityDetailArtikelBinding
import com.example.mydzikirapplication.model.ModelArtikel
import kotlin.math.log

class DetailArtikelActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailArtikelBinding
    companion object {
        const val DETAIL_DESC = "desc"
        const val DETAIL_TITLE = "title"
        const val DETAIL_IMAGE = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val image = intent.getIntExtra(DETAIL_IMAGE, 0)
        val title = intent.getStringExtra(DETAIL_TITLE)
        val desc = intent.getStringExtra(DETAIL_DESC)

        binding.apply {
            tvDetailTitle.text = title
            tvDetailDesc.text = desc
            Glide.with(this@DetailArtikelActivity)
                .load(image).into(imgDetail)
        }
    }
}