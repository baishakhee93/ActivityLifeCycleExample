package com.baishakhee.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG," MainActivity : onCreate invoked");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG," MainActivity : onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG," MainActivity : onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG," MainActivity : onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG," MainActivity : onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG," MainActivity : onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG," MainActivity : onDestroy invoked");
    }

    public void nextMethods(View view) {

        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(i);
    }
}