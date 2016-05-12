package com.ferris.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomMenuLayout menu;
    TextView tv_bottom_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SizeUtils.reset(this);
        findView();
    }

    private void findView() {
        menu= (BottomMenuLayout) findViewById(R.id.bottom_menu);
        tv_bottom_bar=(TextView)findViewById(R.id.tv_bottom_bar);
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
