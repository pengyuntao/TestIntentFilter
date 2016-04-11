package com.yuntao.testintentfilter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickAction1(View view){
        Intent intent=new Intent();
        intent.setAction("com.yuntao.action1");
        startActivity(intent);
    }

    public void clickAction2(View view){
        Intent intent=new Intent();
        intent.setAction("com.yuntao.action2");
        startActivity(intent);
    }

    public void clickActionEmpty(View view){
        Intent intent=new Intent();
        startActivity(intent);
    }

    public void clickCategory1(View view){
        Intent intent=new Intent();
        intent.setAction("com.yuntao.action.c");
        intent.addCategory("com.yuntao.category1");
        intent.addCategory("com.yuntao.category2");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }

    public void clickCategory2(View view){
        Intent intent=new Intent();
        intent.setAction("com.yuntao.action.c");
        intent.addCategory("com.yuntao.category1");
        intent.addCategory("com.yuntao.category11");
        startActivity(intent);
    }

    public void clickData(View view){
        Intent intent=new Intent();
        intent.setAction("com.yuntao.action.data");
        intent.setDataAndType(Uri.parse("content://com.yuntao:90/add"),"video/mp4");
        startActivity(intent);
    }

    public void startActivity(Intent intent){
        try {
            super.startActivity(intent);
        }catch (Exception e){
            showToast("匹配失败");
        }
    }

    private void showToast(String text){
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }

}
