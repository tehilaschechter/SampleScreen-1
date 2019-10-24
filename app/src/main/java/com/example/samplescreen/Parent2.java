package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Parent2 extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView imgProfileHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent2);

        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);
        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);

        // Programatically set CircleImage background color
        // TODO: DETERMINE IF Parent2 IS FEMALE
        Drawable background = frameLayout.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        gradientDrawable.setColor(ContextCompat.getColor(this,R.color.color_female));

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Parent2.this, MainActivity.class);
            @Override
            public void onClick(View v) {
                startActivity(intNextActivity);
                overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
            }
        });
    }

    // Configure back button animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Parent2.this.overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
    }
}
