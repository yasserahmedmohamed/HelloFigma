package com.yasser.btdesignsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import javax.inject.Inject


@Composable
fun DSBox() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                ComponentTokens.tokens.primaryColor
            ),
        contentAlignment = Alignment.Center,

    ) {
        Text(
            text = "Test Overwrite Colors",
            Modifier.background(ComponentTokens.tokens.secondaryColor),

        )
    }

}