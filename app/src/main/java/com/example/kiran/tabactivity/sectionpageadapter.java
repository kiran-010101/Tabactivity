package com.example.kiran.tabactivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kiran on 2/11/18.
 */

public class sectionpageadapter extends FragmentPagerAdapter {

//to store fragments and title
    private final List<Fragment> mfragment = new ArrayList<>();
    private  final  List<String> mtitle = new ArrayList<>();


    //definig class to add fragment and title
    public  void addfragment(Fragment fragment, String title){

        mfragment.add(fragment);
        mtitle.add(title);
        //adding title and fragment to LISt of our fragment and title

    }

    public sectionpageadapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mtitle.get(position);//getting title acc to index
    }

    @Override
    public Fragment getItem(int position) {
        return mfragment.get(position);
    }

    @Override
    public int getCount() {
        return mfragment.size();
    }
}
