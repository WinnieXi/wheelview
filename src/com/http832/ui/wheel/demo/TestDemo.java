package com.http832.ui.wheel.demo;

import android.app.Activity;
import android.os.Bundle;

import com.http832.ui.wheel.WheelView;
import com.http832.ui.wheel.adapter.ArrayWheelAdapter;
import com.http832.wheelview.R;

/**
 * <һ�仰���ܼ���>
 * @author  neusoft
 * @createon 2014��9��1��
 */
public class TestDemo extends Activity {
    WheelView wheelView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
    private String[] arr = new String[]{"1","2","3","4","5","6","7"};
    private void initData() {
        wheelView1.setViewAdapter(new ArrayWheelAdapter<String>(this, arr));
    }
    
    private void initView() {
        wheelView1 = (WheelView)findViewById(R.id.wheelView1);
        
    }
    
}
