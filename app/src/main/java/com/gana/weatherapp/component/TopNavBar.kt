package com.gana.weatherapp.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gana.weatherApp.R
import com.gana.weatherapp.ui.theme.Purple40
import com.gana.weatherapp.ui.theme.White

@Composable
fun TopNavBar() {
    Row(
        modifier = Modifier.fillMaxWidth()
            .height(70.dp)
            .background(color = Purple40)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = "App Logo",
            modifier = Modifier.height(40.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        TextView("Weather App", textSize = 20, textColor = White)
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = "App Logo",
            modifier = Modifier.height(40.dp)
        )

    }
}
@Preview
@Composable
fun TopNavBarPreview() {
    TopNavBar()
}