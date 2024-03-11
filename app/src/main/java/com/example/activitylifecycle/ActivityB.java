package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.os.Bundle;
import static com.example.activitylifecycle.MainActivity.restartCounter;

public class ActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        restartCounter = restartCounter + 5;
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

    public void finishActivityB(View view) {
        ActivityB.this.finish();
    }

}
