package com.northcoders.tatooine.service;

import com.northcoders.tatooine.model.Artist;
import com.northcoders.tatooine.model.Tattoo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ArtistAPIService {
    @GET("artist")
    Call<Artist> login(
            @Query("email") String email,
            @Query("password") String password);

    @GET("artist/{id}")
    Call<Artist> getArtistById(
            @Path("id") Long id);

    @DELETE("artist/{id}")
    Call<String> deleteArtistById(
            @Path("id") Long id);

    @PUT("artist")
    Call<Artist> editProfile(
            @Query("id") Long id,
            @Body Artist artist);

    @POST("artist")
    Call<String> signUp(
            @Body Artist artist);

}
