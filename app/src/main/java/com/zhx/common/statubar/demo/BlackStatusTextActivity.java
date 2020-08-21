package com.zhx.common.statubar.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhx.common.statubar.demo.R;

import org.zhx.common.statubar.CommonStatusBar;

public class BlackStatusTextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        CommonStatusBar.acticity(this).blackText().set();
    }
}
