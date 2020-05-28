package com.zhx.commonapi.common.statubar;

import android.os.Build;

public class Util {
    /**
     * 判断手机支不支持状态栏字体变色
     * Is support status bar dark font boolean.
     *
     * @return the boolean
     */
    public static boolean isSupportChangeTextColor() {
        if (OSUtils.isMIUI6Later() || OSUtils.isFlymeOS4Later()
                || (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)) {
            return true;
        } else
            return false;
    }
}
