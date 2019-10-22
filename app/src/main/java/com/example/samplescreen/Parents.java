package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Parents extends AppCompatActivity {
    ImageView imgProfileHome;
    ImageView imgParent1;
    ImageView imgParent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        imgParent1 = (ImageView)findViewById(R.id.imgParent1);
        imgParent2 = (ImageView)findViewById(R.id.imgParent2);

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        imgParent1.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        imgParent2.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent.class);
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
        Parents.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
