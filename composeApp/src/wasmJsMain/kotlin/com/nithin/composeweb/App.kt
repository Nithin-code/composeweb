package com.nithin.composeweb

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.nithin.composeweb.home.HomeScreen
import org.jetbrains.compose.resources.painterResource

import composeweb.composeapp.generated.resources.Res
import composeweb.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    HomeScreen()
}