package com.nithin.composeweb.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nithin.composeweb.BackgroundColor
import com.nithin.composeweb.Divider
import com.nithin.composeweb.PrimaryAccent
import com.nithin.composeweb.TextPrimary

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    onclick : (String)-> Unit,
    text : String,
    isSelected : Boolean
){

    val borderColor = animateColorAsState(
        targetValue = if (isSelected) PrimaryAccent else Divider,
        animationSpec = tween(durationMillis = 400)
    )

    val contentColor = animateColorAsState(
        targetValue = if (isSelected) PrimaryAccent else TextPrimary,
        animationSpec = tween(durationMillis = 400)
    )

    Surface(
        modifier = modifier
            .height(48.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable {
                onclick.invoke(text)
            },
        border = _root_ide_package_.androidx.compose.foundation.BorderStroke(
            width = 1.dp,
            color = borderColor.value
        ),
        shape = RoundedCornerShape(12.dp),
        color = BackgroundColor
    ) {
        Box(
            modifier = Modifier.padding(16.dp),
            contentAlignment = Alignment.Center
        ){

            Text(
                text = text,
                fontSize = 18.sp,
                color = contentColor.value,
            )
        }
    }

}