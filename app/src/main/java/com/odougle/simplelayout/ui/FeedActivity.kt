package com.odougle.simplelayout.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.odougle.simplelayout.R
import com.odougle.simplelayout.databinding.ActivityFeedBinding

class FeedActivity : AppCompatActivity() {
    private var binding: ActivityFeedBinding = ActivityFeedBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}