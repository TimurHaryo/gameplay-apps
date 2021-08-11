package com.didik.gameplay.app

import android.app.Application
import com.airbnb.epoxy.Carousel

class GameApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Carousel.setDefaultGlobalSnapHelperFactory(null)
    }
}