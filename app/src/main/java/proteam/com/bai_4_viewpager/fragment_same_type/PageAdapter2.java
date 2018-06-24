package proteam.com.bai_4_viewpager.fragment_same_type;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import proteam.com.bai_4_viewpager.R;

public class PageAdapter2 extends PagerAdapter {
    List<String> test;
    Context context;

    public PageAdapter2(List<String> test, Context context) {
        this.test = test;
        this.context = context;
    }

    // This is method used to set weight of page - default is 1.0f(full screen)
//    @Override
//    public float getPageWidth(int position) {
//        return 0.5f;
//    }

    @Override
    public int getCount() {
        return test.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;//true de len nhau
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_fragment_same, container, false);
        TextView tvTest = (TextView) view.findViewById(R.id.tvTest);
        tvTest.setText(test.get(position));
        container.addView(view);
        Log.i("TAG11", test.get(position));
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // This method to set text for PagerTabStrip if have using
        return "TAB " + position;
    }
}
