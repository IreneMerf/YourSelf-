package com.example.yourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Emergency : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)
    }

    fun btn_Forest(view: View) {

        val intent: Intent = Intent(this, Forest ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
    fun btn_Elevator(view: View) {

        val intent:Intent = Intent(this, Elevator ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }

    fun Back(view: View) {
        this.onBackPressed()
        overridePendingTransition(R.anim.left_out,R.anim.right_in)

    }
}