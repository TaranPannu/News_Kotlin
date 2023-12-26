package com.example.roomkt.Dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomkt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
//      userRegistrationService.registerUser("abc@gmail.com","123456")
    }
}

/*
Now dagger will manage and will provide certain objects, that we require

We need to tell two things to Dagger
       —How to create create obj.
       —Where to consume obj.

Component
 -interface
 -

*/