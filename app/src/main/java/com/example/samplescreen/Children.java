package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Children extends AppCompatActivity {
    ImageView imgProfileHome;
    ImageView imgChild1;
    ImageView imgChild2;
    ImageView imgChild3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        imgChild1 = (ImageView)findViewById(R.id.imgChild1);
        imgChild2 = (ImageView)findViewById(R.id.imgChild2);
        imgChild3 = (ImageView)findViewById(R.id.imgChild3);

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
            }
        });

        imgChild1.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, Child.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });

        imgChild2.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, Child2.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });

        imgChild3.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Children.this, Child3.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Children.this.overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
    }
}
