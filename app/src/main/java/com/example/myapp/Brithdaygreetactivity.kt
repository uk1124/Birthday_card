package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_brithdaygreetactivity.*
import kotlinx.android.synthetic.main.activity_main.*

class Brithdaygreetactivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brithdaygreetactivity)

        val name= intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text= "Happy Birthday\n$name !"
    }
}