package com.example.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.Model.Calculate

class View3Model:ViewModel(){
    private val result=MutableLiveData<Calculate>()
    val addition:LiveData<Calculate> get()= result
    fun calculateResult(n1:String,n2:String){
        val n=n1.toInt()
        val nn=n2.toInt()
        val res=n+nn
        val cal=Calculate("jajaa",res)
        result.value=cal

    }
}