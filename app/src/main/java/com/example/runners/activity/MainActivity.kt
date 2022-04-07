package com.example.runners.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.runners.R
import com.example.runners.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var runDao:RunDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Log.d("TAG", "onCreate: ${runDao.hashCode()}")

    }
}