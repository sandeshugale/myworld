package com.github.florent37.sample.diagonallayout;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class DiagonalLayoutMainActivity extends AppCompatActivity {

    Toolbar toolbar;
//    PlaybackState.CustomAction
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagonallayout_activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
