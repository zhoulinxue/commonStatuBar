package com.zhx.commonapi.commonStatubar.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.zhx.commonapi.commonStatubar.statubar.CommonStatusBar;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.dialog_button);
        button.setVisibility(View.VISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TextDialogFragment().show(getSupportFragmentManager(), "textDialog");
            }
        });
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
