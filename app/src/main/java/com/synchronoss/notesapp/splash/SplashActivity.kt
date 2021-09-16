package com.synchronoss.notesapp.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.synchronoss.notesapp.NotesApplication

class SplashActivity: AppCompatActivity() {
    lateinit var splashComponent: SplashComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        splashComponent =
            (applicationContext as NotesApplication).appComponent.splashComponent().create()
        splashComponent.inject(this)

        super.onCreate(savedInstanceState)
    }
}