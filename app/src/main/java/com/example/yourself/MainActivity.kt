package com.example.yourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn_nth(view: View) {
        val intent:Intent = Intent(this@MainActivity, NeedsToHave ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)
    }

    fun btn_firstAid(view: View) {
        val intent:Intent = Intent(this@MainActivity, FirstAid ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)


    }
    fun btnEmergency(view: View) {
        val intent:Intent = Intent(this@MainActivity, Emergency ::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.left_out,R.anim.right_in)  //,R.anim.top_out,R.anim.bottom_in

    }

    fun Exit(view: View) {
        this.finishAffinity()

    }

}