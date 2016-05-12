package com.ferris.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    BottomMenuLayout menu;
    TextView tv_bottom_bar;

    BlurringView mBlurringView;

    FrameLayout rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SizeUtils.reset(this);
        findView();
    }

    private void findView() {
        rootView=(FrameLayout) findViewById(R.id.main_fragment_containt);
        menu= (BottomMenuLayout) findViewById(R.id.bottom_menu);
        tv_bottom_bar=(TextView)findViewById(R.id.tv_bottom_bar);
        mBlurringView=(BlurringView)findViewById(R.id.blurView);

        mBlurringView.setBlurredView(rootView);
        menu.setBottomBar(tv_bottom_bar);
        menu.setBlurView(mBlurringView);
        tv_bottom_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menu.isShowing()){
                    menu.hide();
                }else{
                    menu.show();
                }
            }
        });
    }
}
