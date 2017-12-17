package com.spnj.tugasfoodsy;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Layout_15 extends AppCompatActivity {
    Toolbar tb;
    ViewPager viewPager;
    TabLayout tl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_15);

        //agar toolbar ada tombol back
        tb=(android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Mendefinisikan Tab Layout
        viewPager = (ViewPager) findViewById(R.id.vp);
        tl = (TabLayout) findViewById(R.id.tl);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tl.setupWithViewPager(viewPager);
    }

    //Membuat Tab Layout
    class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment f = null;
            if (position ==0){
                f = new Food_menu();
            }if(position==1){
                f = new Place_details();
            }if(position==2){
                f = new Place_reviews();
            }
            return f;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position){
            String name = null;
            if (position==0){
                name = "FOOD MENU";
            }if (position==1){
                name = "PLACE DETAILS";
            }if (position==2){
                name = "PLACE REVIEWS";
            }
            return name;
        }

    }
}
