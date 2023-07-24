package com.hwido.football

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class LoginIndividualActivity : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login_individualactivity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        var fbAuth : FirebaseAuth? = null
//        var fbFirestore : FirebaseFirestore? = null
//
//        fbAuth = FirebaseAuth.getInstance()
//        fbFirestore = FirebaseFirestore.getInstance()

//        val check = view.findViewById<EditText>(R.id.membership_personal_check)
        val finalButton = view.findViewById<Button>(R.id.membership_personal_finalButton)
//
//
        finalButton.setOnClickListener {

            val database = Firebase.database
            val myRef = database.getReference("membership_personal")
//            val myRef = database.getReference("membership_personal").child(Firebase.auth.currentUser!!.uid)

            val birth = view.findViewById<EditText>(R.id.membership_personal_birth)?.text.toString()

            val foot = view.findViewById<EditText>(R.id.membership_personal_foot).text.toString()
            val height = view.findViewById<EditText>(R.id.membership_personal_height).text.toString()
            val name = view.findViewById<EditText>(R.id.membership_personal_name).text.toString()
            val position = view.findViewById<EditText>(R.id.membership_personal_position).text.toString()
            val team = view.findViewById<EditText>(R.id.membership_personal_team).text.toString()
            val teamButton = view.findViewById<Button>(R.id.membership_personal_teamButton)
            val weight = view.findViewById<EditText>(R.id.membership_personal_weight).text.toString()

            val data = LoginMemberPersonalData(birth, foot, height, name, position, team, weight)
            print(data)
            Log.d(data.birth, data.birth.toString())
            Log.d(data.foot, data.foot.toString())

            myRef
                .push()
                .setValue(data)
        }
    }
}