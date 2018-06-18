package com.example.babybest.movieapp.api;

import com.example.babybest.movieapp.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by babybest on 15/06/2018.
 */

public interface Service {
    @GET("movie/popular")
    Call<MoviesResponse>getPopularMovies(@Query("api_key")String apiKey );

    @GET("movie/top_rated")
    Call<MoviesResponse>getTopRatedMovies(@Query("api_key")String apiKey );
}
