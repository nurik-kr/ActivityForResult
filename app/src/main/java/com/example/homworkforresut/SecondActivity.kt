package com.example.homworkforresut

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val cb1 = findViewById<CheckBox>(R.id.cb1)
        val cb2 = findViewById<CheckBox>(R.id.cb2)
        val cb3 = findViewById<CheckBox>(R.id.cb3)
        val btEnd = findViewById<Button>(R.id.btEnd)

        var CbInfo1: String? = null
        var CbInfo2: String? = null
        var CbInfo3: String? = null

        btEnd.setOnClickListener {
            val intent = Intent()

            if (cb1.isChecked)
            {
                CbInfo1 = cb1.text.toString()
            } else
            {
                CbInfo1 = ""
            }
            intent.putExtra("CbInfo1", CbInfo1)

            if (cb2.isChecked)
            {
                CbInfo2 = cb2.text.toString()
            } else
            {
                CbInfo2 = ""
            }
            intent.putExtra("CbInfo2", CbInfo2)

            if (cb3.isChecked)
            {
            CbInfo3 = cb3.text.toString()
            } else
            {
            CbInfo3 = ""
            }
            intent.putExtra("CbInfo3", CbInfo3)

            setResult(Activity.RESULT_OK, intent)
            finish()
        }

    }
}
