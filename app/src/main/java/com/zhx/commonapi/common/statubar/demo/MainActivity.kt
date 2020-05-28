package com.zhx.commonapi.common.statubar.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhx.commonapi.common.statubar.CommonStatusBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        CommonStatusBar.acticity(this).isBlackText(true).start()
    }
}
