package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements TestFragment.MyListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestFragment testFragment = TestFragment.newInstance(10, this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, testFragment).commit();
    }

    @Override
    public void doThings(int listenerInt) {
        Log.i("Here's the int:", listenerInt + "");
    }
}
