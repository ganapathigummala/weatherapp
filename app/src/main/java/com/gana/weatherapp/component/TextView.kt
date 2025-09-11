package com.gana.weatherapp.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.gana.weatherapp.ui.theme.Black

@Composable
fun TextView(
    text: String,
    modifier: Modifier = Modifier,
    textSize : Int = 16,
    textColor : Color = Black
    ) {
    Text(
        text=text,
        modifier=modifier,
        color=textColor,
        fontSize = textSize.sp,
    )
}
@Preview
@Composable
fun TextViewPreview() {
    TextView(text = "Hello World")
}