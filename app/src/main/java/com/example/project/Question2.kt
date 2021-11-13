package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Question2 : AppCompatActivity() {
    lateinit var rmale:RadioButton
    lateinit var rfemale:RadioButton
    lateinit var inputText: EditText
    lateinit var hindi:CheckBox
    lateinit var english:CheckBox
    lateinit var submit:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        rmale=findViewById<RadioButton>(R.id.radioButton2)
        rfemale=findViewById<RadioButton>(R.id.radioButton3)
        inputText=findViewById<EditText>(R.id.editText)
        hindi=findViewById<CheckBox>(R.id.checkBox3)
        english=findViewById<CheckBox>(R.id.checkBox4)
        submit=findViewById<Button>(R.id.button3)

        hindi.setOnClickListener{
            Toast.makeText(applicationContext,"Selected:Hindi",Toast.LENGTH_SHORT).show()
        }
        english.setOnClickListener{
            Toast.makeText(applicationContext,"Selected:English",Toast.LENGTH_SHORT).show()
        }
        rmale.setOnClickListener{
            Toast.makeText(applicationContext,"Gender:Male",Toast.LENGTH_SHORT).show()
        }
        rfemale.setOnClickListener{
            Toast.makeText(applicationContext,"Gender:Female",Toast.LENGTH_SHORT).show()
        }

        submit.setOnClickListener{
            var result="Name:"
            result+=inputText.text.toString();
            result+="\n Language known:"
            if(hindi.isChecked){
                result+="\n \t Hindi"
            }
            if(english.isChecked){
                result+="\n \t English"
            }
            result+="\n Gender:"
            if(rmale.isChecked){
                result+="\t Male"
            }
            if(rfemale.isChecked){
                result+="\t Female"
            }
            Toast.makeText(applicationContext,result,Toast.LENGTH_SHORT).show()
        }
    }
}