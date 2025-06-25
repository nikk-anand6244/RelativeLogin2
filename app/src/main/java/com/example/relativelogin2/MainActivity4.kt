package com.example.relativelogin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity4 : AppCompatActivity() {
    private var btn: Button?=null
    private var tx: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.bt1)
        btn?.setOnClickListener {
            Toast.makeText( this,"Signup Done", Toast.LENGTH_SHORT).show()

        }
        btn=findViewById(R.id.bt4)
        btn?.setOnClickListener {
            Toast.makeText( this,"Next UI Screen", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        tx=findViewById(R.id.tv7)
        tx?.setOnClickListener {
            Toast.makeText( this,"Login Screen", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
        tx=findViewById(R.id.tv1)
        tx?.setOnClickListener {
            Toast.makeText( this,"On SignUp Screen", Toast.LENGTH_SHORT).show()

        }
    }
}