package com.example.communication.api

import com.example.communication.models.AlbumResponse
import com.example.communication.models.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("albums")
    suspend fun getAlbums(): List<AlbumResponse>

    @GET("albums/{albumId}/photos")
    suspend fun getPhotosByAlbumId(@Path("albumId") albumId: Int): List<PhotoResponse>
}