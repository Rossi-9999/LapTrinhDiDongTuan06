package com.example.tuan6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showText(String input) {
        BotFragment bottomFragment
                = (BotFragment) this.getSupportFragmentManager()
                .findFragmentById(R.id.fragbot);
        bottomFragment.showText(input);
    }
}