package com.example.orderfoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Make_bill extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    TextView tvtable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makebill);
        tvtable = findViewById(R.id.tvtab);
    }

    public void Showtable(View view) {
        PopupMenu popupmenu = new PopupMenu(this,view);
        popupmenu.setOnMenuItemClickListener(this);
        popupmenu.inflate(R.menu.take_table_menu);
        popupmenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.tab1 :
                tvtable.setText("Bàn 1");
                return true;
            case R.id.tab2 :
                tvtable.setText("Bàn 2");
                return true;
            case R.id.tab3 :
                tvtable.setText("Bàn 3");
                return true;
            case R.id.tab4 :
                tvtable.setText("Bàn 4");
                return true;
        }
        return false;
    }
}
