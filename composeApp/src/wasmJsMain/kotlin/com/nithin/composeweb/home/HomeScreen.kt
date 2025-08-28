package com.nithin.composeweb.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.nithin.composeweb.BackgroundColor
import com.nithin.composeweb.components.TitleComponent

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .background(BackgroundColor)
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        TitleComponent()

    }
}