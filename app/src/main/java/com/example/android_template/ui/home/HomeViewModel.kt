package com.example.android_template.ui.home

import com.example.communication.models.AlbumResponse
import kotlinx.coroutines.flow.StateFlow

data class HomeUiModel(
    val albumsList: List<AlbumResponse>
)
interface HomeViewModel {
    fun fetchAlbums()
    val viewState: StateFlow<HomeUiModel>
}