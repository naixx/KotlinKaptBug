package com.example.astra.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.EActivity

@EActivity
open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @AfterViews
    internal fun afterViews(){

    }
}
