package com.example.orderfoodapp;

import android.os.Bundle;

import com.example.orderfoodapp.Fragment.HistoryFragment;
import com.example.orderfoodapp.Fragment.HomeFragment;
import com.example.orderfoodapp.Fragment.InvoicePending;
import com.example.orderfoodapp.Fragment.MenuOrderFragment;
import com.example.orderfoodapp.Fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectorfragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectorfragment = new HomeFragment();
                    break;
                case R.id.navigation_pendingInvoice:
                    selectorfragment = new InvoicePending();
                    break;
                case R.id.navigation_MenuOder:
                    selectorfragment = new MenuOrderFragment();
                    break;
                case R.id.navigation_History:
                    selectorfragment = new HistoryFragment();
                    break;
                case R.id.navigation_User:
                    selectorfragment = new UserFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,selectorfragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,new HistoryFragment()).commit();

    }

}
