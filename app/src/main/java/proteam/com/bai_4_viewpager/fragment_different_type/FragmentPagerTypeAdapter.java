package proteam.com.bai_4_viewpager.fragment_different_type;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerTypeAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public FragmentPagerTypeAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);

        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int arg0) {
        return this.fragments.get(arg0);
    }

    @Override
    public int getCount() {

        return this.fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // This method to set text for PagerTabStrip if have using
        return "TAB " + position;
    }

    /* @Override
    public float getPageWidth(int position) {
        return 0.9f;
    }*/
}
