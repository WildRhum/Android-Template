package com.example.android_template.ui

import androidx.annotation.StringRes
import com.example.android_template.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.title_home)
    object Dashboard : Screen("dashboard", R.string.title_dashboard)
    object Notifications : Screen("notifications", R.string.title_notifications)
}

