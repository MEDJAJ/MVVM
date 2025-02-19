package com.example.mvvm.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.ViewModel.View3Model

class MainActivity3 : AppCompatActivity() {
    private lateinit var modelview:View3Model
    companion object{
       lateinit var name:String
        lateinit var  res:String
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val number1=findViewById<EditText>(R.id.number1)
        val number2=findViewById<EditText>(R.id.number2)
        val btn=findViewById<Button>(R.id.transmitre)
        val cl=findViewById<TextView>(R.id.click)

        modelview=ViewModelProvider(this).get(View3Model::class.java)

        modelview.addition.observe(this,{person->
            name=person.name
            res=person.res.toString()
            cl.setText("hellow ${person.name} your somme est ${person.res}")

        })
        btn.setOnClickListener {
            val int1=number1.text.toString()
            val int2=number2.text.toString()
            modelview.calculateResult(int1,int2)
            startActivity(Intent(this,AfficherResult::class.java))

        }



    }
}