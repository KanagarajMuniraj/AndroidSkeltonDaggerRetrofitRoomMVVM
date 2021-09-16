package com.synchronoss.notesapp.di

import com.synchronoss.notesapp.main.MainComponent
import com.synchronoss.notesapp.splash.SplashComponent
import dagger.Component

@Component(modules = [GlobalModule::class, SubComponentModule::class])
interface AppComponent {
    fun mainComponent(): MainComponent.Factory
    fun splashComponent(): SplashComponent.Factory
}