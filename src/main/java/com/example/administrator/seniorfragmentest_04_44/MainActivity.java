package com.example.administrator.seniorfragmentest_04_44;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity implements BookListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 指定加载R.layout.activity_book_list对应的界面布局文件
        // 但实际上该应用会根据屏幕分辨率加载不同的界面布局文件
        setContentView(R.layout.activity_book_list);
        // 如果加载的界面布局文件中包含ID为book_detail_container的组件
       /* if (findViewById(R.id.book_detail_container) != null) {
            mTwoPane = true;
            ((BookListFragment) getFragmentManager()
                    .findFragmentById(R.id.book_list))
                    .setActivateOnItemClick(true);
        }*/
    }


    @Override
    public void onItemSelected(Integer id) {

        // 创建启动BookDetailActivity的Intent
        Intent detailIntent = new Intent(this, BookDetailActivity.class);
        // 设置传给BookDetailActivity的参数
        detailIntent.putExtra(BookDetailFragment.ITEM_ID, id);
        // 启动Activity
        startActivity(detailIntent);
    }

}
