package com.yasser.mailodesigntokens

import androidx.compose.ui.graphics.Color
import com.yasser.btdesignsystem.ComponentColors
import com.yasser.btdesignsystem.ComponentTokens

object MailoTokens {
    private val tokens = ComponentColors(Color.Black, Color.Yellow)
    fun setDealTokens(){
        ComponentTokens.tokens = tokens
    }
}


