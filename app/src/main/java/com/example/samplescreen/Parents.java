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
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });

        imgParent1.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });

        imgParent2.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent.class);
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
        overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
    }
}
