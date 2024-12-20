package com.example.wattsappclone

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainpage2 : AppCompatActivity() {
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage2)
        btn1=findViewById(R.id.btnall)
        btn2=findViewById(R.id.btnunread)
        btn3=findViewById(R.id.btngroup)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.framelayout,AllFragment()).commit()
        }
        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.framelayout,UnreadFragment()).commit()
        }
        btn3.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.framelayout,GroupFragment()).commit()
        }


    }
}