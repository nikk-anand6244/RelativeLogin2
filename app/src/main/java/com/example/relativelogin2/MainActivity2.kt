package com.example.relativelogin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    private var btn: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.btn1)
        btn?.setOnClickListener {
            Toast.makeText( this,"Login Screen", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn=findViewById(R.id.btArrow)
        btn?.setOnClickListener {
            Toast.makeText( this,"Next UI Screen", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
        btn=findViewById(R.id.btn2)
        btn?.setOnClickListener {
            Toast.makeText( this,"Signup Screen", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
}