package com.example.viewmodelapp


import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter: Int = 10

    fun increment() {
        counter++;
    }

}