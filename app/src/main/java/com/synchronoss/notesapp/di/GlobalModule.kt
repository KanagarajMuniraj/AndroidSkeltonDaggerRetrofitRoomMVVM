package com.synchronoss.notesapp.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class GlobalModule(private val application: Application) {
    @Provides
    fun provideContext(): Context = application.applicationContext

    @Provides
    @Named("Greeting")
    fun provideGreeting() = "Welcome to Synchronoss"
}