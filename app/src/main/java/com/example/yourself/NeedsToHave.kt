package com.example.yourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NeedsToHave : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nth)
    }

    fun btnHomeFirstFid(view: View) {

        val intent: Intent = Intent(this, HomeFirstAidKit ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
    fun btnFirstAid(view: View) {

        val intent: Intent = Intent(this, FirstAidKit ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)


    }
    fun btnanAlarmingSuitcase(view: View) {

        val intent: Intent = Intent(this, Anxiety ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }

    fun Back_Htn(view: View) {
        this.onBackPressed()
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
}