package com.zhx.common.common.statubar

import android.app.Activity
import org.zhx.common.statubar.CommonStatusBar

class BarFactory {


    companion object staticFun {
        fun createStatusBar(activity: Activity): CommonStatusBar {
//            val tag: String = getTag(activity)
            return CommonStatusBar(activity);
        }

        fun getTag(activity: Activity): String {
            return System.identityHashCode(activity).toString();
        }
    }


}