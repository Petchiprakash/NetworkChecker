package com.example.networkchecker

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val networkConnection = NetworkConnection(applicationContext)
        networkConnection.observe(this, { isConnected ->
            if (isConnected){
                layoutDisConnected.visibility = View.GONE
                layoutConnected.visibility = View.VISIBLE
            }else{
                layoutConnected.visibility = View.GONE
                layoutDisConnected.visibility =View.VISIBLE
            }
        })
    }
}