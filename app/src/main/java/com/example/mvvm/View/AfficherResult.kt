package com.example.mvvm.View

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.ViewModel.View2Model
import com.example.mvvm.ViewModel.View3Model

class AfficherResult : AppCompatActivity() {
    lateinit var model:View3Model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_afficher_result)
val res=findViewById<TextView>(R.id.afficher)
res.setText("${MainActivity3.name} et res ${MainActivity3.res}")
//model=ViewModelProvider(this).get(View3Model::class.java)
//        model.addition.observe(this,{ person->
//            res.setText("hellow ${person.name} your somme est ${person.res}")
//        })
    }
}