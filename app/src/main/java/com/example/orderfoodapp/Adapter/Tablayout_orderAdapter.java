package com.example.orderfoodapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.orderfoodapp.Fragment.Fragment_DrinkOder;
import com.example.orderfoodapp.Fragment.Fragment_foodOder;

public class Tablayout_orderAdapter extends FragmentStatePagerAdapter {
    private String listTittle[] = {"Đồ Uống","Đồ Ăn",};
    private Fragment_DrinkOder fragmentOne;
    private Fragment_foodOder fragmentAboutMe;



    public Tablayout_orderAdapter(FragmentManager fm) {
        super(fm);
        fragmentOne = new Fragment_DrinkOder();
        fragmentAboutMe = new Fragment_foodOder();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return listTittle[position];
    }
    @Override
    public Fragment getItem(int i) {
        if(i  == 0){
            return fragmentOne;
        }

        else if(i == 1){
            return fragmentAboutMe;
        }
        else {}
        return null;
    }

    @Override
    public int getCount() {
        return listTittle.length;
    }

}
