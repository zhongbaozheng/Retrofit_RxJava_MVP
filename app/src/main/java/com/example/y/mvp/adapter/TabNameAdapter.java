package com.example.y.mvp.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.y.mvp.fragment.ImageMainFragment;
import com.example.y.mvp.mvp.Bean.TabNameInfo;

import java.util.List;

/**
 * by y on 2016/4/28.
 */
public class TabNameAdapter extends FragmentPagerAdapter {


    private final List<TabNameInfo> mData;

    public TabNameAdapter(FragmentManager fm, List<TabNameInfo> mDatas) {
        super(fm);
        this.mData = mDatas;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageMainFragment.newInstance(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mData.get(position).getName();
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
