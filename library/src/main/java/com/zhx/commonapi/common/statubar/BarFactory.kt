package com.zhx.commonapi.common.statubar

import android.app.Activity

/**
 * Copyright (C), 2015-2020
 * FileName: BarFactory
 * Author: zx
 * Date: 2020/5/29 16:40
 * Description:
 */
class BarFactory {


    companion object staticFun {
        fun createStatusBar(activity: Activity): CommonStatusBar {
            val tag: String = getTag(activity)
            return CommonStatusBar(activity,tag);
        }

        private fun getTag(activity: Activity): String {
            if (activity != null) {
                return activity.javaClass.simpleName
            }
            return System.identityHashCode(activity).toString();
        }
    }


}