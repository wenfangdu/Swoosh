package com.leonbec.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.leonbec.swoosh.Model.Player
import com.leonbec.swoosh.R
import com.leonbec.swoosh.Utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

//    override fun onSaveInstanceState(outState: Bundle?) {
//        super.onSaveInstanceState(outState)
//        outState?.putParcelable(EXTRA_PLAYER, player)
//    }
//
//    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
//        super.onRestoreInstanceState(savedInstanceState)
//        if (savedInstanceState != null)
//            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensBtnClicked(view: View) {
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "mens"
    }

    fun womensBtnClicked(view: View) {
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "womens"
    }

    fun coedBtnClicked(view: View) {
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextBtnClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
    }

}
