package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Family extends AppCompatActivity {
    ImageView imgProfileHome;
    Button btnSpouse;
    Button btnChildren;
    Button btnParents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        btnSpouse = (Button)findViewById(R.id.btnSpouse);
        btnChildren = (Button)findViewById(R.id.btnChildren);
        btnParents = (Button)findViewById(R.id.btnParents);

        imgProfileHome.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        btnSpouse.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Spouse.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        btnChildren.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Children.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        btnParents.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Parents.class);
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
        Family.this.overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
    }
}
