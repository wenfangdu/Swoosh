package com.leonbec.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.leonbec.swoosh.R

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
