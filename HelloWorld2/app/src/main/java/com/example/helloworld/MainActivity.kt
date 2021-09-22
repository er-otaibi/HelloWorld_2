package com.example.helloworld

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var myText: TextView
    lateinit var submit: Button
    lateinit var resend: Button
    lateinit var signup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById(R.id.SMScode)
        submit = findViewById(R.id.Submit)
        resend = findViewById(R.id.Resend)
        signup = findViewById(R.id.SignUp)
        changeColor(submit)
        changeColor(resend)
        changeColor(signup)
        submit.setOnClickListener { myFunction1() }
        resend.setOnClickListener{ myFunction2()}
        signup.setOnClickListener{ myFunction3()}
    }
    @SuppressLint("SetTextI18n")
    fun myFunction1(){
        submit.text = "Thank You you Number is Verified"
    }
    @SuppressLint("SetTextI18n")
    fun myFunction2(){
        resend.text = "The SMS code is Sent Again"
    }
    @SuppressLint("SetTextI18n")
    fun myFunction3(){
        signup.text = "Create a new account"
    }
    fun changeColor(b: Button){
        if( b == resend){

            b.setBackgroundColor(resources.getColor(R.color.teal_200))
        }else{
            b.setBackgroundColor(resources.getColor(R.color.purple_200))
        }


    }


}