package com.nithin.composeweb.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nithin.composeweb.BackgroundColor
import com.nithin.composeweb.Divider
import com.nithin.composeweb.PrimaryAccent
import com.nithin.composeweb.TextPrimary

@Composable
fun TitleComponent(){

    var selectedBtn by remember {
        mutableStateOf("View Profile")
    }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(24.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(brush = Brush.linearGradient(colors = listOf(BackgroundColor,
                PrimaryAccent
            ))),
        border = _root_ide_package_.androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = Divider
        ),
        shape = RoundedCornerShape(20.dp),
        shadowElevation = 5.dp,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.linearGradient(colors = listOf(BackgroundColor,
                    PrimaryAccent
                )))
        ) {

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "HI, I'm Nithin",
                fontSize = 48.sp,
                color = TextPrimary,
                modifier = Modifier.padding(start = 35.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Android Developer | Kotlin | Jetpack Compose | KMP",
                fontSize = 32.sp,
                color = TextPrimary,
                modifier = Modifier.padding(start = 35.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.padding(start = 35.dp)
            ) {
                CustomButton(
                    onclick = {
                        selectedBtn = it
                    },
                    text = "View Profile",
                    isSelected = selectedBtn == "View Profile"
                )

                Spacer(modifier = Modifier.width(16.dp))

                CustomButton(
                    onclick = {
                        selectedBtn = it
                    },
                    text = "Download Resume",
                    isSelected = selectedBtn == "Download Resume"
                )
            }

        }
    }

}