package com.example.yourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)
    }

    fun btn_bleeding(view: View) {
        val intent: Intent = Intent(this, Bleeding ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)

    }

    fun btn_bite(view: View) {}

    fun Overcooling(view: View) {}

    fun btn_burn(view: View) {}

    fun btn_Bruise(view: View) {}

    fun btn_Poisoning(view: View) {}

    fun btn_ElectricShock(view: View) {}

    fun Back_FirstAid(view: View) {
        this.onBackPressed()
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }
}