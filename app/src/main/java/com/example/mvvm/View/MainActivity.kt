package com.example.mvvm.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.ViewModel.UserViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val name=findViewById<EditText>(R.id.name)
        val btn=findViewById<Button>(R.id.edit)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        viewModel.use.observe(this,{ user->
           name.setText(user.name)
        })

        btn.setOnClickListener{
val inten=Intent(this,MainActivity2::class.java)
            startActivity(inten)
            viewModel.getUser()

        }

    }
}