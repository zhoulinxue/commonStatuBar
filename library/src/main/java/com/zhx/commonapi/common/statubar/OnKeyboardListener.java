package com.zhx.commonapi.common.statubar;
/**
 * Copyright (C), 2015-2020
 * FileName: OnKeyboardListener
 * Author: zx
 * Date: 2020/5/29 16:40
 * Description:
 */
public interface OnKeyboardListener {
    /**
     * On keyboard change.
     *
     * @param isPopup        the is popup  是否弹出
     * @param keyboardHeight the keyboard height  软键盘高度
     */
    void onKeyboardChange(boolean isPopup, int keyboardHeight);
}
