package com.example.fragmentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    SectionStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: starts");
        mSectionsStatePagerAdapter =new SectionStatePagerAdapter(getSupportFragmentManager());
        mViewPager=findViewById(R.id.container);
        setupViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager mViewPager) {
        SectionStatePagerAdapter adapter= new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment1(),"Fragment1");
        adapter.addFragment(new Fragment2(),"Fragment2");
        adapter.addFragment(new Fragment2(),"Fragment2");
        mViewPager.setAdapter(adapter);
    }
    public void setViewPager(int fragmentNumber)
    {
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
