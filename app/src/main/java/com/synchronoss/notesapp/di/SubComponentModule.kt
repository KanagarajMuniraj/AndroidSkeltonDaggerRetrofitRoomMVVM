package com.synchronoss.notesapp.di

import com.synchronoss.notesapp.main.MainComponent
import com.synchronoss.notesapp.splash.SplashComponent
import dagger.Module

@Module(subcomponents = [MainComponent::class, SplashComponent::class])
class SubComponentModule