package com.zhx.commonapi.commonStatubar.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zhx.commonapi.commonStatubar.statubar.CommonStatusBar

class FragmentTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.fragment_container, StatubarFragment()).commit()
    }

    override fun onResume() {
        super.onResume()
        CommonStatusBar.acticity(this).whiteText().set()
    }
    override fun onDestroy() {
        super.onDestroy()
        CommonStatusBar.acticity(this).destroy()
    }
}
