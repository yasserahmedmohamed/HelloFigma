package com.yasser.btdesignsystem

import androidx.compose.ui.graphics.Color

object ComponentTokens {
    var tokens: ComponentColors = ComponentColors()
}




data class ComponentColors(
    val primaryColor:Color = Color.Blue,
    val secondaryColor: Color = Color.White
)


