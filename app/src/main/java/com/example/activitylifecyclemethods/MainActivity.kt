package com.example.activitylifecyclemethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("TAG", "message")

    }

    override fun onStart() {
        super.onStart()
        Handler(Looper.getMainLooper()).postDelayed({
            println("This is my message")
        }, 3000)

    }

    override fun onResume() {
        super.onResume()
        Handler(Looper.getMainLooper()).postDelayed({
            Log.d("TAG", "message")
        }, 3000)
    }

    override fun onPause() {
        super.onPause()
        Handler(Looper.getMainLooper()).postDelayed({

        }, 1000)
    }

    override fun onStop() {
        super.onStop()
        Handler(Looper.getMainLooper()).postDelayed({

        })
    }

    override fun onRestart() {
        super.onRestart()
        Handler(Looper.getMainLooper()).postDelayed({

        })
    }

    override fun onDestroy() {
        super.onDestroy()
        Handler(Looper.getMainLooper()).postDelayed({

        })
    }
}

private fun Handler.postDelayed(any: Any) {

}