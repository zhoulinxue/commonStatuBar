package com.zhx.commonapi.common.statubar.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhx.commonapi.common.statubar.CommonStatusBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tanchuang_btn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                var fragment:DialogTestFragment= DialogTestFragment()
                fragment.show(supportFragmentManager,"test")
            }
        })
//        supportFragmentManager.beginTransaction().replace(R.id.container,TestFragment()).commit()
    }

    override fun onResume() {
        super.onResume()
        CommonStatusBar.acticity(this).isBlackText(true).start()
    }
}
