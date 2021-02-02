package com.malkinfo.recyclerviewdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malkinfo.recyclerviewdemo.R
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val fruitsData = intent
        val fruitsName = fruitsData.getStringExtra("fruitsName")
        val fruitsInfo = fruitsData.getStringExtra("fruitsInfo")
        val fruitsImg = fruitsData.getIntExtra("fruitsImg",0)
        imgF.setImageResource(fruitsImg)
        fuitsName.text = fruitsName
        fuitsInfo.text = fruitsInfo


    }
}