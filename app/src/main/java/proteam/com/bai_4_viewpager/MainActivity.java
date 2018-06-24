package proteam.com.bai_4_viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import proteam.com.bai_4_viewpager.fragment_different_type.MainDifferentActivity;
import proteam.com.bai_4_viewpager.fragment_same_type.MainSameActivity2;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSameType).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainSameActivity2.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btnDiffType).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainDifferentActivity.class);
                startActivity(intent);
            }
        });

    }
}
