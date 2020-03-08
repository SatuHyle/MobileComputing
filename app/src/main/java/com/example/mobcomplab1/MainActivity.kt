package com.example.mobcomplab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobcomplab1.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_time.setOnClickListener{
            startActivity(Intent(applicationContext, TimeActivity::class.java))
        }

        button_map.setOnClickListener{
            startActivity(Intent(applicationContext, MapActivity::class.java))
        }

        button_special.setOnClickListener{
            startActivity(Intent(applicationContext, SpecialActivity::class.java))
        }
    }
}
