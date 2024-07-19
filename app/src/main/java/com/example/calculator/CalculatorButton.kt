package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val FONT_SIZE_TEXT = 36.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = FONT_SIZE_TEXT,
            color = Color.White
        )
    }
}

@Composable
@Preview
fun CalculatorButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CalculatorButton(
            symbol = "1",
            modifier = Modifier,
            onClick = { }
        )

        Spacer(modifier = Modifier.padding(8.dp))

        CalculatorButton(
            symbol = "2",
            modifier = Modifier,
            onClick = { }
        )

        Spacer(modifier = Modifier.padding(8.dp))

        CalculatorButton(
            symbol = "3",
            modifier = Modifier,
            onClick = { }
        )
    }
}
