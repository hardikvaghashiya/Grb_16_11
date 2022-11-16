package com.grubbrpractical

import android.app.Application
import io.paperdb.Paper

class PracticalApp: Application() {

    override fun onCreate() {
        super.onCreate()

        /*Initialize paper book database*/
        Paper.init(this)
    }
}