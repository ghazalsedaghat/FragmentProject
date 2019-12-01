package com.example.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabAdapter Adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);


        Adapter = new TabAdapter(getSupportFragmentManager());
        Adapter.addFragment(new Tab1Fragment(), "Tab1");
        Adapter.addFragment(new Tab2Fragment(), "Tab2");
        Adapter.addFragment(new Tab3Fragment(), "Tab3");

        viewPager.setAdapter(Adapter);
        tabLayout.setupWithViewPager(viewPager);



        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setType("application/octet-stream");

    }

}
