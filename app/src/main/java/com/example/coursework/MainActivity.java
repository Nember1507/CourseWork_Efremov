package com.example.coursework;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        AdapterClass adapterClass = new AdapterClass(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapterClass.addFragment(new Fragment_house(), "Home");
        adapterClass.addFragment(new Fragment_routines(), "Routines");
        adapterClass.addFragment(new Fragment_statics(), "Statics");
        adapterClass.addFragment(new Fragment_settings(), "Settings");
        viewPager.setAdapter(adapterClass);
        tabLayout.getTabAt(0).setIcon(R.drawable.frame_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.frame_routines);
        tabLayout.getTabAt(2).setIcon(R.drawable.frame_statics);
        tabLayout.getTabAt(3).setIcon(R.drawable.frame_setting);
    }

}