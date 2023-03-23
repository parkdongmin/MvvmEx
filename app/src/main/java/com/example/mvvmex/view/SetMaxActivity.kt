package com.example.mvvmex.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmex.R
import com.example.mvvmex.databinding.ActivitySetMaxBinding
import com.example.mvvmex.viewModel.MainViewModel

class SetMaxActivity : AppCompatActivity() {
    private lateinit var mbind : ActivitySetMaxBinding

    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbind = DataBindingUtil.setContentView(this, R.layout.activity_set_max)

        this.also { mbind.lifecycleOwner = it }
        mbind.viewmodelSetMaxNum = MainViewModel()

        var max : EditText = findViewById(R.id.maxnum)
        var completeBtn : Button = findViewById(R.id.complete)

        completeBtn.setOnClickListener{
            model.setMaxNum(Integer.parseInt(max.text.toString()))
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}