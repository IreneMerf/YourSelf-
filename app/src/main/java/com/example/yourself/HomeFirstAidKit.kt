package com.example.yourself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeFirstAidKit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hfak)
    }

    fun Back_Hfak(view: View) {
        this.onBackPressed()
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
}