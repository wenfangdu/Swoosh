package com.leonbec.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${this::class.java.simpleName} onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${this::class.java.simpleName} onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${this::class.java.simpleName} onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"${this::class.java.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${this::class.java.simpleName} onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG,"${this::class.java.simpleName} onRestarted")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"${this::class.java.simpleName} onDestroy")
        super.onDestroy()
    }

}
