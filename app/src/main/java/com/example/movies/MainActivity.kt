package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var manager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var movies = listOf(MovieItem(R.drawable.rampage), MovieItem(R.drawable.rampage), MovieItem(R.drawable.rampage), MovieItem(R.drawable.rampage), MovieItem(R.drawable.rampage), MovieItem(R.drawable.rampage))

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        manager = GridLayoutManager(this, 2)

        binding.recyclerView.apply {
            adapter = MovieAdapter(movies)
            layoutManager = manager
        }
    }
}