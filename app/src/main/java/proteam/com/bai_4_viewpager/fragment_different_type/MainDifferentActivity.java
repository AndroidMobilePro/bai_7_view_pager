package proteam.com.bai_4_viewpager.fragment_different_type;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import proteam.com.bai_4_viewpager.R;

public class MainDifferentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initialisePaging();
    }

    private void initialisePaging() {
        // Define list fragment
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());

        FragmentPagerTypeAdapter mPagerAdapter = new FragmentPagerTypeAdapter(this.getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(mPagerAdapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }


            @Override
            public void onPageSelected(int position) {
                Log.i("TAG11", position + "///");
            }


            @Override
            public void onPageScrollStateChanged(int state) {
                Log.i("TAG11", state + "/aaa/");
                //1 bat dau cuon
                //2 co chuyen trang
                //0 khi nha tay ra
            }
        });


    }

}
