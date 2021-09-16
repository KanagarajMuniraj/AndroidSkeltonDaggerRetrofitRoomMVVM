package com.synchronoss.notesapp.splash

import com.synchronoss.notesapp.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SplashComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SplashComponent
    }

    fun inject(splashActivity: SplashActivity)
}