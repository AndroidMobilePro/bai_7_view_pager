package proteam.com.bai_4_viewpager.fragment_different_type;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import proteam.com.bai_4_viewpager.R;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        if (container == null) {
            return null;
        }

        return (LinearLayout) inflater.inflate(R.layout.layout_fragment1, container, false);
    }
}
