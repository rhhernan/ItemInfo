package com.cryotek.iteminfo;

import com.cryotek.iteminfo.FragmentScanner;
import com.cryotek.iteminfo.FragmentHomePage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Raul on 1/19/2016.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {


    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return FragmentHomePage.newInstance(1);
            case 1:
                return FragmentScanner.newInstance(2);
//            case 2:
//                return "SECTION 3";
        }
        return null;
        //return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position) {
//            case 0:
//                return "SECTION 1";
//            case 1:
//                return "SECTION 2";
//            case 2:
//                return "SECTION 3";
//        }
//        return null;
//    }

}