package com.example.kiran.tabactivity;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="Main Activity";



   private sectionpageadapter msectionpageadapter;//declaring class sectionpageadapter



    private ViewPager mviewpager;
//we have used viewpager in mainactiviy.xml ...it comes directly when we choose tbbed activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"oncreate:Staring");

        msectionpageadapter = new sectionpageadapter(getSupportFragmentManager());

        //setup viewpager with the section adapter

        mviewpager = (ViewPager)findViewById(R.id.container);

        setupViewpager(mviewpager);//passing to function setupviewpager


        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);//tabs is the id of tablayout in mainactivity.xml

        tabLayout.setupWithViewPager(mviewpager);









    }


    //craeting viewpager method and putting argument
    private void setupViewpager(ViewPager viewPager){

        sectionpageadapter  adapter = new sectionpageadapter(getSupportFragmentManager());
        adapter.addfragment(new tab1fragment(),"TAB1");
        adapter.addfragment(new fragment2(),"TAB2");
        adapter.addfragment(new tab3fragment(),"t3");
        //passing value to constructor in sectionpageadapter class

        viewPager.setAdapter(adapter);




    }


}
