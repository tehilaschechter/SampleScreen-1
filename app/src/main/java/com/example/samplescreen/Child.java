package com.example.samplescreen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Child extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Child.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
