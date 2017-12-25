package com.leonbec.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.leonbec.swoosh.Model.Player
import com.leonbec.swoosh.R
import com.leonbec.swoosh.Utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun skillFinishBtnClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun beginnerSkillBtnClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun ballerSkillBtnClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
}
