package yadunandan.shubham;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout t1;
    ViewPager vp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_owner_profile);
        t1=(TabLayout)findViewById(R.id.maintablayout);
        vp1=(ViewPager)findViewById(R.id.mainviewpager);
      //  vp1.setAdapter(new fragment(getSupportFragmentManager()));

    }
}
