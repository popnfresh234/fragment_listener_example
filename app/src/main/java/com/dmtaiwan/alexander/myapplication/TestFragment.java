package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Alexander on 7/26/2017.
 */

public class TestFragment extends Fragment {

    private int myInt;
    private MyListner listener;

    public static TestFragment newInstance(int myInt, MyListner listener) {
        TestFragment fragment = new TestFragment();
        fragment.myInt = myInt;
        fragment.listener = listener;
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listener.doThings(myInt);
    }

    public interface MyListner {
        void doThings(int listenerInt);
    }

}
