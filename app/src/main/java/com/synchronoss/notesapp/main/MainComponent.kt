package com.synchronoss.notesapp.main

import com.synchronoss.notesapp.di.ActivityScope
import com.synchronoss.notesapp.main.MainFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent()
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(homeFragment: MainFragment)
}