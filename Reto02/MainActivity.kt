package com.example.reto02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var btnAccept: Button
    private lateinit var editText: EditText
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        editText = findViewById(R.id.edit_text)
        editText = findViewById(R.id.edit_text1)
        editText = findViewById(R.id.edit_text2)
        editText = findViewById(R.id.edit_text3)




        btnAccept.setOnClickListener {
            val text1 = editText.text.toString()
            val text2 = editText1.text.toString()
            val text3 = editText2.text.toString()
            val text4 = editText3.text.toString()


            if (text1.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty()) {
                imageView.setImageResource(R.drawable.palomaroja)
            } else {
                imageView.setImageResource(R.drawable.palomaverde)
            }


            }
        }
}