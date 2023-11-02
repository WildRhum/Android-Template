package com.example.android_template.di

import android.app.Application
import com.example.communication.network.retrofitModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(appModule, retrofitModule)
        }
    }
}