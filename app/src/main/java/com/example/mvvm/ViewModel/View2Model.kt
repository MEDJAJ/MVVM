package com.example.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.Model.Person
import java.util.Calendar

class View2Model:ViewModel(){
   private val personn=MutableLiveData<Person>()
    val pers:LiveData<Person> =personn
    fun afficherAge(name:String,date:String){
            val age= Calendar.getInstance().get(Calendar.YEAR)
            var year=age-date.toInt()
            var person= Person(name,year)
        personn.value=person



    }
}