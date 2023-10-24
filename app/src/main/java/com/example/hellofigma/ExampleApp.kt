package com.example.hellofigma

import android.app.Application
import com.yasser.mailodesigntokens.MailoTokens


class ExampleApp:Application() {

    override fun onCreate() {
        super.onCreate()
        MailoTokens.setDealTokens()
    }
}