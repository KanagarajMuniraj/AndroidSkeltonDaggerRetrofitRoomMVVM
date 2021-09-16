package com.synchronoss.notesapp

import android.app.Application
import com.synchronoss.notesapp.di.AppComponent
import com.synchronoss.notesapp.di.DaggerAppComponent
import com.synchronoss.notesapp.di.GlobalModule

class NotesApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        this.appComponent = DaggerAppComponent.builder().globalModule(GlobalModule(this)).build()
    }
}