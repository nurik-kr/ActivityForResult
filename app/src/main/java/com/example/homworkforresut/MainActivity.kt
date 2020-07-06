package com.example.homworkforresut

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

var tv1: TextView? = null
var tv2: TextView? = null
var tv3: TextView? = null


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        tv2 = findViewById<TextView>(R.id.tv2)
        tv3 = findViewById<TextView>(R.id.tv3)
        val btGo = findViewById<Button>(R.id.btGO)

        btGo.setOnClickListener {
        val intent = Intent(this,SecondActivity::class.java)

            startActivityForResult(intent,1)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK){
            val CbInfo1 = data?.getStringExtra("CbInfo1")
            tv1?.text = CbInfo1
            val CbInfo2 = data?.getStringExtra("CbInfo2")
            tv2?.text = CbInfo2
            val CbInfo3 = data?.getStringExtra("CbInfo3")
            tv3?.text = CbInfo3
        }
    }
}