package com.zhx.commonapi.common.statubar

import android.app.Activity

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