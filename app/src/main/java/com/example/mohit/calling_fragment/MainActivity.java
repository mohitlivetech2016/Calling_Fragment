package com.example.mohit.calling_fragment;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.example.mohit.calling_fragment.listener.OnFragmentActionInterractionListner;

import fragment.First_Fragment;


public class MainActivity extends FragmentActivity implements OnFragmentActionInterractionListner {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        ((TextView)findViewById(R.id.txtLabel)).setText("hello");
    }
}
