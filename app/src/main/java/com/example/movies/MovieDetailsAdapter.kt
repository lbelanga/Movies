package com.example.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.databinding.MovieDetailsBinding

class MovieDetailsAdapter(private val MovieDetailsList: List<MovieDetails>) :
    RecyclerView.Adapter<MovieDetailsAdapter.MovieDetailsViewHolder>() {

    inner class MovieDetailsViewHolder(private val binding: MovieDetailsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movieDetails: MovieDetails) {
            with(movieDetails){
                binding.backgroundImage.setImageResource(imageBackground)
                binding.movieDescription.text = description
                binding.movieRating.text = rating
                binding.movieDate.text = date
                binding.favoriteIcon.setImageResource(
                    if (true) R.drawable.ic_baseline_favorite_24
                    else R.drawable.ic_baseline_favorite_border_24
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieDetailsViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = MovieDetailsBinding.inflate(inflater, parent, false)
        return MovieDetailsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieDetailsViewHolder, position: Int) {
        holder.bind(MovieDetailsList[position])
    }

    override fun getItemCount(): Int = MovieDetailsList.size
}