package com.example.appsales29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appsales29032022.di.AppComponent;
import com.example.appsales29032022.di.DaggerAppComponent;

public class MainActivity extends AppCompatActivity {
Xehoi xehoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = DaggerAppComponent.builder().build();
        appComponent.injectMainActivity(this);

        Log.d("BBB", xehoi.toString());
    }
}