package com.example.calculater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById<EditText>(R.id.Number1)
        val number2 = findViewById<EditText>(R.id.Number2)
        val addition=findViewById<Button>(R.id.addition)







       addition.setOnClickListener {

            val total = number1.text.toString().toInt() + number2.text.toString().toInt()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("total" , total)
            intent.putExtra("number1" , number1.text.toString())
            intent.putExtra("number2" ,number2.text.toString())
            intent.putExtra("operation" , addition.text)
            startActivity(intent)
        }




    }
    /*fun passValue(total:Int, number1:Int ,number2:Int,operation:String){
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("total" , total)
        intent.putExtra("number1" , number1)
        intent.putExtra("number2" , number2)
        intent.putExtra("operation" , operation)
        startActivity(intent)
    }*/


}