package proteam.com.bai_4_viewpager.fragment_same_type;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import proteam.com.bai_4_viewpager.R;

public class MainSameActivity2 extends AppCompatActivity {
    private PageAdapter2 mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initialisePaging();
    }


    private void initialisePaging() {
        // TODO Auto-generated method stub
        List<String> fragments = new ArrayList<>();
        fragments.add("Android");
        fragments.add("iOS");
        fragments.add("Web");
        fragments.add("Nodejs");
        fragments.add("Javascript");
        fragments.add("Php");
        mPagerAdapter = new PageAdapter2(fragments, this);
        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(mPagerAdapter);

    }


}
