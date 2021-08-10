package com.odougle.simplelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.simplelayout.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private var binding: ActivityProfileBinding = ActivityProfileBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}