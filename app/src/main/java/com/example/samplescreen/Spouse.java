package com.example.samplescreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Spouse extends AppCompatActivity {
    ImageView imgProfileHome;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spouse);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        frameLayout = (FrameLayout)findViewById(R.id.frameLayout);

        // Programatically set CircleImage background color
        Drawable background = frameLayout.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        gradientDrawable.setColor(ContextCompat.getColor(this,R.color.color_female));

        imgProfileHome.setOnClickListener(new View.OnClickListener() {
            Intent intNextActivity = new Intent(Spouse.this, MainActivity.class);
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
        Spouse.this.overridePendingTransition(R.transition.anim_push_in_left,R.transition.anim_push_out_right);
    }
}
