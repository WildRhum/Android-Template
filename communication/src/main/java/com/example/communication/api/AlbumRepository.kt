package com.example.communication.api

import com.example.communication.models.AlbumResponse

/**
 * fetches data from remote source
 */
class AlbumRepository(private val apiService: ApiService) {
    suspend fun fetchAlbums(): Result<List<AlbumResponse>> {
        return runCatching {
            apiService.getAlbums()
        }
    }
}