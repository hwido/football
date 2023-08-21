package com.hwido.football

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment


class MainMainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_mainpage)

        val firstFragment = Fragment1()
        val secondFragment = Fragment2()
        val thirdFragment = Fragment3()
        val forthFragment = Fragment4()

        setCurrentFragment(firstFragment)

//        main_mainpage_navigation.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.main_mainpage_schedule->setCurrentFragment(firstFragment)
//                R.id.main_mainpage_teamRanking->setCurrentFragment(secondFragment)
//                R.id.main_mainpage_teamRecord->setCurrentFragment(thirdFragment)
//                R.id.main_mainpage_individualRecord->setCurrentFragment(forthFragment)
//            }
//            true
//        }
    }

    fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_mainpage_fragment,fragment)
            commit()
        }
}