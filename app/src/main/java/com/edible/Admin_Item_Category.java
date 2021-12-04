package com.edible;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Admin_Item_Category extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_item_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null){

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new AddFragment()).commit();
        navigationView.setCheckedItem(R.id.add);
            }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.add:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AddFragment()).commit();
                break;

            case R.id.delete:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DeleteFragment()).commit();
                break;

            case R.id.update:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new UpdateFragment()).commit();
                break;

            case R.id.print:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PrintFragment()).commit();
                break;

            case R.id.customer:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CustomerFragment()).commit();
                break;

            case R.id.admin_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AdminSettingsFragment()).commit();
                break;

            case R.id.order_id:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new OrderIDFragment()).commit();
                break;


        }
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else {
        super.onBackPressed();
        }
    }
}