package com.hwido.football

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainMainpageFragmentIndividualrecord : Fragment() {

    //private lateinit var rankingsRef : DatabaseReference
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_mainpage_fragment_individualrecord, container, false)
    }

//    override fun onCreate(savedInstanceState : Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.main_mainpage_fragment_individualrecord)
//
//        rankingsRef = FirebaseDatabase.getInstance().getReference("Rankings")
//
//        rankingsRef.orderByChild("score").addListenerForSingleValueEvent(object :
//            ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                // Handle retrieved data
//                for (rankingSnapshot in dataSnapshot.children) {
//                    val playerName = rankingSnapshot.child("name").getValue(String::class.java)
//                    val playerScore = rankingSnapshot.child("score").getValue(Long::class.java)
//
//                    // Now you can use playerName and playerScore to display the ranking in your UI
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {
//                // Handle database error
//            }
//        })
//    }
}