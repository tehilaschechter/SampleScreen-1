package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Wisdom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisdom);
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Wisdom.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
