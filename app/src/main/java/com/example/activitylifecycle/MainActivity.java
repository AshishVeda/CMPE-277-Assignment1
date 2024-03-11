package com.example.activitylifecycle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static Integer restartCounter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restartCounter += 0;
        TextView threadCounterText = findViewById(R.id.textView3);
        threadCounterText.setText(String.valueOf(restartCounter));
        System.out.println("Restart Counter: "+restartCounter);
    }


    @Override
    protected void onResume() {
        super.onResume();
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
        restartCounter = 0;
    }

    public void startActivityB(View view){
        startActivity(new Intent(MainActivity.this, ActivityB.class));
    }
    public void startActivityC(View view){
        startActivity(new Intent(MainActivity.this, ActivityC.class));
    }
    public void simpleDialogue (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Simple Dialog")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                })
                .show();
    }
    public void finishActivityA(View view) {
        MainActivity.this.finish();
    }

}