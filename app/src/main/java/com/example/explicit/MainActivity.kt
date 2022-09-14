package com.example.explicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityManagerCompat

class MainActivity : AppCompatActivity() {
    lateinit var mMsgEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMsgEditText=findViewById(R.id.textmsg)

    }

    fun lauchsecondactivity(view: View) {
    Toast.makeText(this,"send button Clicked",Toast.LENGTH_LONG).show()
        Log.i("MainActivity","button is speaking")
        var msg =mMsgEditText.text.toString()
       var intent = Intent(this,SecondActivity::class.java)


        intent.putExtra("Msg",msg)
        startActivity(intent)
    }

}