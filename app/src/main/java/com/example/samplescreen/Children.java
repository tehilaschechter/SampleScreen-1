package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Children extends AppCompatActivity {
    ImageView imgChild1;
    ImageView imgChild2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        imgChild1 = (ImageView)findViewById(R.id.imgChild1);
        imgChild2 = (ImageView)findViewById(R.id.imgChild2);

        imgChild1.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, Child.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        imgChild2.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, Parent.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Children.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
