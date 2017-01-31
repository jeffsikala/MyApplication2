package com.example.youngh.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by YoungH on 1/31/17.
 */

public class ViewPagerStateAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> fragmentArrayList;

    public ViewPagerStateAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentArrayList.get(position).getClass().getName();
    }

    public void setContent(ArrayList<Fragment> fragmentArrayList){
        this.fragmentArrayList = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
