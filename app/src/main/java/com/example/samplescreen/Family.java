package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Family extends AppCompatActivity {
    Button btnSpouse;
    Button btnChildren;
    Button btnParents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        btnSpouse = (Button)findViewById(R.id.btnSpouse);
        btnChildren = (Button)findViewById(R.id.btnChildren);
        btnParents = (Button)findViewById(R.id.btnParents);

        btnSpouse.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Spouse.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_cut,R.transition.anim_cut);
            }
        });

        btnChildren.setOnClickListener(new View.OnClickListener(){
            Intent intNextActivity = new Intent(Family.this, Child.class);
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
}
