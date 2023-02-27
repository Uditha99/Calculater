package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val Number1 =findViewById<TextView>(R.id.number1)
        val number2=findViewById<TextView>(R.id.number2)
        val operation=findViewById<TextView>(R.id.operation)
        val total=findViewById<TextView>(R.id.total)



        Number1.text=intent.getStringExtra("number1")
        number2.text=intent.getStringExtra("number2")
        operation.text=intent.getStringExtra("operation")
        total.text=intent.getIntExtra("total",0).toString()

    }
}