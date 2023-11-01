package com.example.android_template.di

import com.example.android_template.ui.dashboard.DashboardViewModel
import com.example.android_template.ui.home.HomeViewModelImpl
import com.example.android_template.ui.notifications.NotificationsViewModel
import com.example.communication.api.AlbumRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModelImpl(get()) }
    viewModel { NotificationsViewModel() }
    viewModel { DashboardViewModel() }
    single { AlbumRepository(get()) }
}