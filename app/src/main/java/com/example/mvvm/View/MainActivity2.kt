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
import com.example.mvvm.ViewModel.View2Model

class MainActivity2 : AppCompatActivity() {
    lateinit var view2Model: View2Model

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val edit1=findViewById<EditText>(R.id.namepers)
        val edit2=findViewById<EditText>(R.id.Agep)
        val b=findViewById<Button>(R.id.Age)
        val res=findViewById<TextView>(R.id.result)
        res.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        view2Model=ViewModelProvider(this).get(View2Model::class.java)

        view2Model.pers.observe(this,{ person->
            res.setText("hellow ${person.name} your Age est ${person.age}")
        })
        b.setOnClickListener {
            val name=edit1.text.toString()
            val age=edit2.text.toString()
            view2Model.afficherAge(name,age)
        }

    }
}