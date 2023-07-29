package com.hwido.football

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.hwido.football.databinding.LoginIndividualactivityBinding

class LoginIndividualActivity : AppCompatActivity() {
    private lateinit var binding : LoginIndividualactivityBinding

    private var fbAuth : FirebaseAuth? = null
    private var fbFirestore : FirebaseFirestore? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginIndividualactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fbAuth = FirebaseAuth.getInstance()
        fbFirestore = FirebaseFirestore.getInstance()

        //val check = findViewById<EditText>(R.id.login_individualactivity_check)
        val finalButton = findViewById<Button>(R.id.login_individualactivity_finalButton)

        finalButton.setOnClickListener {
            val database = Firebase.database
            val myRef = database.getReference("membership_personal")
            val birth = findViewById<EditText>(R.id.login_individualactivity_birth)?.text.toString()
            val foot = findViewById<EditText>(R.id.login_individualactivity_foot).text.toString()
            val height = findViewById<EditText>(R.id.login_individualactivity_height).text.toString()
            val name = findViewById<EditText>(R.id.login_individualactivity_name).text.toString()
            val position = findViewById<EditText>(R.id.login_individualactivity_position).text.toString()
            val team = findViewById<EditText>(R.id.login_individualactivity_team).text.toString()
            //val teamButton = findViewById<Button>(R.id.login_individualactivity_teamButton)
            val weight = findViewById<EditText>(R.id.login_individualactivity_weight).text.toString()

            val data = LoginMemberPersonalData(birth, foot, height, name, position, team, weight)

            Log.d(data.birth, data.birth.toString())

            myRef
                .push()
                .setValue(data)

        }
    }


//            print(data)
//            Log.d(data.foot, data.foot.toString())
}