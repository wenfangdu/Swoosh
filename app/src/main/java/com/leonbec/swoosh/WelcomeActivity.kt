package com.leonbec.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun getStartedBtnClicked(view: View) {
        val leagueActivity = Intent(this, LeagueActivity::class.java)
        startActivity(leagueActivity)
    }
}
