package com.example.yourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Elevator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elevator)
    }

    fun Back(view: View) {
        this.onBackPressed()
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
}