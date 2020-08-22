package org.zhx.common.statubar

import android.app.Activity

class BarFactory {
    companion object staticFun {
        private var map: HashMap<String, CommonStatusBar> = HashMap();
        fun createStatusBar(activity: Activity): CommonStatusBar {
            val tag: String = getTag(activity)
            var bar: CommonStatusBar? = map.get(tag)
            if (bar == null) {
                bar = CommonStatusBar(activity);
                map.put(tag, bar)
            }
            return bar
        }

        fun getTag(activity: Activity): String {
            return System.identityHashCode(activity).toString();
        }
    }


}