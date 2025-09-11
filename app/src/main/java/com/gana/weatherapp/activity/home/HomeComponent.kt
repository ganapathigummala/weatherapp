package com.gana.weatherapp.activity.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gana.weatherapp.component.TopNavBar

@Composable
fun HomeComponent() {
    Scaffold(
        topBar = { TopNavBar() }
    ) { innerPadding ->

        Column(
            modifier = Modifier.fillMaxHeight()
                .padding(innerPadding)
            ) {

        }
    }


}

@Preview
@Composable
fun HomeComponentPreview() {
    HomeComponent()
}