package com.example.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMul = findViewById(R.id.btn_multiplication)
        btnDiv = findViewById(R.id.btn_division)



    }

    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.btn_add ->{}
            R.id.btn_subtraction ->{}
            R.id.btn_multiplication ->{}
            R.id.btn_division ->{}
        }
    }
}