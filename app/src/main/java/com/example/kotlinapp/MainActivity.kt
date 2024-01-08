package com.example.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd : Button //initialized variable with their views
    // lateint used with only mutable datatype eg var, and non-nullable datatype.
    // also lateint values must be initialised before use.
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add) //connection to id in activity_main.xml
        btnSub = findViewById(R.id.btn_subtraction)
        btnMul = findViewById(R.id.btn_multiplication)
        btnDiv = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.resulttv)

        btnAdd.setOnClickListener(this) // varible connected with id/view used with setOnClickListener.
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
    }
    override fun onClick(v: View?) {

        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id)
        {
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_subtraction ->{
                result = a-b
            }
            R.id.btn_multiplication ->{
                result = a*b
            }
            R.id.btn_division ->{
                result = a/b
            }
        }
        resultTv.text="Result is $result"
    }
}