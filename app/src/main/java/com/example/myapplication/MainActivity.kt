package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()/*,View:OnClickListener*/{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //监听事件
       /* mLoginBtn.setOnClickListener(object:View:OnClickListener{
            startActivity(Intent(this,DetailActivity::class.java))
        })
       override fun onClick("p0:View?"){} */
    }

}


