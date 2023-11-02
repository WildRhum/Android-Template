package com.example.android_template.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeComposable(
    navController: NavController,
    viewModel: HomeViewModelImpl = koinViewModel(),
) {
    val viewState by viewModel.viewState.collectAsState()
    HomeScreen(viewState)
}

@Composable
fun HomeScreen(
    viewState: HomeUiModel
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = viewState.albumsList.map { it.title }.joinToString("\n"))
    }
}

@Composable
@Preview
fun Home() {
    HomeScreen(HomeUiModel(listOf()))
}