package com.example.activitylifecycle;

import static com.example.activitylifecycle.MainActivity.restartCounter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        restartCounter = restartCounter + 10;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        super.onRestart();

    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    public void finishActivityC(View view) {
        ActivityC.this.finish();
    }

}
