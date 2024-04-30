package com.softwareengineering.personalmovie.presentation

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.softwareengineering.personalmovie.R
import com.softwareengineering.personalmovie.databinding.ActivityLoadingBinding
import com.softwareengineering.personalmovie.presentation.type.TypeActivity
import com.bumptech.glide.Glide

class LoadingActivity: AppCompatActivity() {
    private lateinit var binding:ActivityLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinds()
        showLoadingImage()
    }

    private fun initBinds(){
        binding= ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun showLoadingImage(){
        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(applicationContext, TypeActivity::class.java)
            startActivity(intent)
        }, 2500)


        Glide.with(this).load(R.raw.clapperboard).into(binding.ivFrameLoading);
    }
}