package com.example.youngh.myapplication;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.youngh.myapplication.adapter.ViewPagerAdapter;
import com.example.youngh.myapplication.fragment.ContentFragment;
import com.example.youngh.myapplication.fragment.HistoryFragment;
import com.example.youngh.myapplication.fragment.LoginFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ArrayList<Fragment> fragmentList= new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initialView();
    }

    private void initialView() {
        ContentFragment contentFragment = new ContentFragment();
        fragmentList.add(contentFragment);
        fragmentList.add(new LoginFragment());
        fragmentList.add(new HistoryFragment());

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);



    }
}
