package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Parents extends AppCompatActivity {
    ImageView imgProfileHome;
    FrameLayout frameLayout;
    ImageView imgParent1;
    ImageView imgParent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout2);
        imgParent1 = (ImageView)findViewById(R.id.imgParent1);
        imgParent2 = (ImageView)findViewById(R.id.imgParent2);

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
            }
        });

        //todo: determine if parent1 is female

        // Programatically set CircleImage background color
        // TODO: DETERMINE IF parent2 IS FEMALE
        Drawable background = frameLayout.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        gradientDrawable.setColor(ContextCompat.getColor(this,R.color.color_female));

        imgParent1.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_right,R.transition.anim_push_out_left);
            }
        });

        imgParent2.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parents.this, Parent2.class);
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
