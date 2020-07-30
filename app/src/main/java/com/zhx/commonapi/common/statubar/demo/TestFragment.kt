package com.zhx.commonapi.common.statubar.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Copyright (C), 2015-2020
 * FileName: TestFragment
 * Author: zx
 * Date: 2020/5/29 16:40
 * Description:
 */
class TestFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }
}