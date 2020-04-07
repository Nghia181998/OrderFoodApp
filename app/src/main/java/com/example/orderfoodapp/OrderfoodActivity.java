package com.example.orderfoodapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.orderfoodapp.Adapter.Tablayout_orderAdapter;
import com.google.android.material.tabs.TabLayout;

public class OrderfoodActivity extends AppCompatActivity {
    ActionBar actionBar;

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderfood);
        initView();
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#becff1")));
    }
    private void initView() {
        viewPager =findViewById(R.id.vp);
        viewPager.setAdapter(new Tablayout_orderAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl);
        tabLayout.setupWithViewPager(viewPager);


    }
}
