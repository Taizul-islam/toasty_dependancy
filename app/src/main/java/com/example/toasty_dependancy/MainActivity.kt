package com.example.toasty_dependancy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toasty.SimpleToaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleToaster.showToast(applicationContext,"Hi")
        Toast.makeText(this,"hello", Toast.LENGTH_LONG).show()
    }
}