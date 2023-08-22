package com.hwido.football

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment


class MainMainpage : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_mainpage)

        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
        fragmentTransaction.add(R.id.main_mainpage_fragment, Fragment1())
        fragmentTransaction.commit()
    }

    override fun onClick(v: View?) {
        Log.d("버튼 클릭!", "버튼 클릭!")

        var fr: Fragment? = null

        when (v?.id) {
            R.id.main_mainpage_schedule -> {
                fr = Fragment1()
            }
            R.id.main_mainpage_teamranking -> {
                fr = Fragment2()
            }
            R.id.main_mainpage_teamrecord -> {
                fr = Fragment3()
            }
            R.id.main_mainpage_individualrecord -> {
                fr = Fragment4()
            }
        }

        val fm = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()

        // fragment 교체
        fragmentTransaction.replace(R.id.main_mainpage_fragment, fr!!)
        fragmentTransaction.commit()
    }


}