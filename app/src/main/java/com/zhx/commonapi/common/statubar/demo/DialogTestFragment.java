package com.zhx.commonapi.common.statubar.demo;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

/**
 * Copyright (C), 2015-2020
 * FileName: DialogTestFragment
 * Author: zx
 * Date: 2020/5/29 17:12
 * Description:
 */
public class DialogTestFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.fragment_layout);
        return dialog;
    }
}
