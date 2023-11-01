package com.example.android_template.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.communication.api.AlbumRepository
import com.example.communication.models.AlbumResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class HomeViewModelImpl  constructor(private val albumRepository: AlbumRepository) :
    ViewModel(), HomeViewModel {

    private var _albumList = MutableStateFlow<List<AlbumResponse>>(emptyList())

    @Suppress("UNCHECKED_CAST")
    override val viewState = combine(
        _albumList,
    ) { params ->

        val albumsList = params[0] as List<AlbumResponse>

        HomeUiModel(
            albumsList = albumsList
        )
    }.stateIn(viewModelScope, SharingStarted.Lazily, HomeUiModel(albumsList = listOf()))

    init {
        fetchAlbums()
    }
    override fun fetchAlbums() {
        viewModelScope.launch {
            runCatching {
                albumRepository.fetchAlbums()
            }.fold(
                onSuccess = { albums ->
                    _albumList.update { albums.getOrThrow() }
                },
                onFailure = { exception -> throw exception }
            )
        }
    }
}