package com.hwido.football

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hwido.football.databinding.LoginChooseBinding

class LoginChoose : AppCompatActivity() {
    private lateinit var binding : LoginChooseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginChooseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teamCardView.setOnClickListener {
            goToTeamMaker()
        }
        binding.individualCardView.setOnClickListener {
            goToIndividualMaker()
        }
    }

    private fun goToTeamMaker(){
        val intent = Intent(baseContext, LoginTeamActivity::class.java)
        startActivity(intent)
    }
    private fun goToIndividualMaker(){
        val intent = Intent(baseContext, LoginIndividualActivity::class.java)
        startActivity(intent)
    }
}