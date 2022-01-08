package com.kanneki.shimmereffect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kanneki.shimmereffect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainAdapter()
        }
    }

    override fun onResume() {
        super.onResume()
        binding.shimmerLayout.startShimmerAnimation()
    }

    override fun onPause() {
        super.onPause()
        binding.shimmerLayout.stopShimmerAnimation()
    }
}