package com.hwido.football

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentMenu : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
        // fragment 상속 받고 layout 폴더의 fragment_menu 파일과 연결, 이를 화면의 띄운다
    }
}