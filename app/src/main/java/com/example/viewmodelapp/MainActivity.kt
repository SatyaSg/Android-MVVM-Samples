package com.example.viewmodelapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputLayout.LengthCounter

class MainActivity : AppCompatActivity() {

    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCounter = findViewById(R.id.textview_first)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setText()
    }

    private fun setText() {
        txtCounter.setText(mainViewModel.counter.toString())
    }

    fun increment(v: View) {
        mainViewModel.increment()
        setText()
    }


}