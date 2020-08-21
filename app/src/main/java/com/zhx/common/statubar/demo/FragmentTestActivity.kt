package com.zhx.common.statubar.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.zhx.common.statubar.CommonStatusBar

class FragmentTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(
            R.id.fragment_container,
            StatubarFragment()
        ).commit()
    }

    override fun onResume() {
        super.onResume()
        CommonStatusBar.acticity(this).whiteText().set()
    }
}
