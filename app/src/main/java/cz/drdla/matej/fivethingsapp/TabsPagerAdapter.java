package cz.drdla.matej.fivethingsapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {
    private String[] title = {
            "I",
            "L",
            "O",
            "V",
            "E",
            "U"
    };

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}