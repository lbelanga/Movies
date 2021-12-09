package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemMovie = MovieItem(R.drawable.rampage)
        val itemMovie2 = MovieItem(R.drawable.rampage)
        val itemMovie3 = MovieItem(R.drawable.rampage)
        val itemMovie4 = MovieItem(R.drawable.rampage)
        findViewById<RecyclerView>(R.id.recycler_view).adapter = MovieAdapter(listOf(itemMovie, itemMovie2, itemMovie3, itemMovie4))
    }
}