package org.zhx.common.statubar.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zhx.common.statubar.demo.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        List<String> datas = new ArrayList<>();
        datas.add("沉浸式状态栏_亮色字体");
        datas.add("沉浸式状态栏_暗色字体");
        datas.add("fragment中效果");
        datas.add("底部输入框");
        datas.add("diaolog");
        RecyclerView recyclerView = findViewById(R.id.list_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        StringAdapter adapter = new StringAdapter(datas);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position) {
                    case 0:
                        skip(WhiteStatusTextActivity.class);
                        break;
                    case 1:
                        skip(BlackStatusTextActivity.class);
                        break;
                    case 2:
                        skip(FragmentTestActivity.class);
                        break;
                    case 3:
                        skip(BottomInputActivity.class);
                        break;
                    case 4:
                        skip(DialogActivity.class);
                        break;
                }
            }
        });
    }


    private void skip(Class<? extends Activity> clzz) {
        startActivity(new Intent(ListActivity.this, clzz));
    }
}
