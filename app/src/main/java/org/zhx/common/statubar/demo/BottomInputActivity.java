package org.zhx.common.statubar.demo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhx.common.statubar.demo.R;

import org.zhx.common.statubar.CommonStatusBar;

public class BottomInputActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edite_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        CommonStatusBar.acticity(this).blackText().set();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        CommonStatusBar.acticity(this).destroy();
    }
}
