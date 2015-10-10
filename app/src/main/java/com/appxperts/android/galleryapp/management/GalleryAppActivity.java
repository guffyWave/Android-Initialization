package com.appxperts.android.galleryapp.management;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by gufran on 10/10/15.
 */
public class GalleryAppActivity extends AppCompatActivity implements ActivitySetup {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        referView();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        initialize();
        applyTypeFace();
        setUpActionBar();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }


    ///-------------------------->>


    @Override
    public void referView() {

    }

    @Override
    public void applyTypeFace() {

    }

    @Override
    public void initialize() {

    }

    @Override
    public void setUpActionBar() {

    }
}
