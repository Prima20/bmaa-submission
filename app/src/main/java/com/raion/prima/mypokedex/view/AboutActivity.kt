package com.raion.prima.mypokedex.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raion.prima.mypokedex.R
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        initData()
    }

    fun initData(){
        tv_about_name.text = "Primananda Kurnia"
        tv_about_email.text = "primakurnia555@gmail.com"
    }
}