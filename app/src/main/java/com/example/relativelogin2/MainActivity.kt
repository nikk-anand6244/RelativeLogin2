package com.example.relativelogin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var btn: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.btn1)
        btn?.setOnClickListener {
            Toast.makeText(this, "Login Done", Toast.LENGTH_SHORT).show()
        }
        btn=findViewById(R.id.btn2)
        btn?.setOnClickListener {
            Toast.makeText(this, "MainActivity3", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}