package com.example.gamerzhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class NavigationDrawer extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        init();

        // step 1

        setSupportActionBar(toolbar);

        // Action

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(NavigationDrawer.this,drawerLayout,toolbar,R.string.Open,R.string.Close);

        // Add listener
        drawerLayout.addDrawerListener(toggle);

        // Sync the state is very important

        toggle.syncState();

        // By default fragment loaded

        loadFragment(new container_fragment(),R.id.container);
        // Now to select from navigation menu items we use

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId(); // which item is selected it returns an id
                if (id==R.id.home)
                {

                    loadFragment(new container_fragment(),R.id.container);


                }
                else if (id==R.id.orders)
                {
                    loadFragment(new container_fragment(),R.id.container);
                }
                else if (id==R.id.contactus)
                {
                    loadFragment(new contactUs(),R.id.contactus_container);
                }
                else {
                    // obvious then logout

                    Intent ret=new Intent(NavigationDrawer.this,SignUppage.class);
                    startActivity(ret);
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true; // change it to true
            }
        });

    }


    @Override
    public void onBackPressed() {
    if (drawerLayout.isDrawerOpen(GravityCompat.START))
    {
                drawerLayout.closeDrawer(GravityCompat.START);

    }
    else {
        // If drawer is closed and user wants to get back
        super.onBackPressed();



    }


    }

    private void loadFragment(Fragment frag,int containerId) {

        FragmentManager manager= getSupportFragmentManager();
        manager.beginTransaction()
        .replace(containerId, frag)
        .commit();

    }

    private void init()
    {
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);
        toolbar=findViewById(R.id.toolBar);


    }
}