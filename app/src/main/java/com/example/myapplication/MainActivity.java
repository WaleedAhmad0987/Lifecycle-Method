package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG,"onCreate");

    }
    
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }


    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
    public void displayToast(View v){
        Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
    }
}