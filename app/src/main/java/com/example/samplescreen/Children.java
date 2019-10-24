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

public class Children extends AppCompatActivity {
    ImageView imgProfileHome;
    FrameLayout frameLayout2; //todo: delete
    FrameLayout frameLayout3; //todo: delete
    ImageView imgChild1;
    ImageView imgChild2;
    ImageView imgChild3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_children);

        imgProfileHome = (ImageView)findViewById(R.id.btnProfileHome);
        frameLayout2 = (FrameLayout)findViewById(R.id.frameLayout2); //todo: delete
        frameLayout3 = (FrameLayout)findViewById(R.id.frameLayout3); //todo: delete
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

        //todo: determine if child1 is female

        // Programatically set CircleImage background color
        // TODO: DETERMINE IF Child2 IS FEMALE
        Drawable background = frameLayout2.getBackground();
        GradientDrawable gradientDrawable = (GradientDrawable) background.mutate();
        gradientDrawable.setColor(ContextCompat.getColor(this,R.color.color_female));

        // Programatically set CircleImage background color
        // TODO: DETERMINE IF Child3 IS FEMALE
        Drawable background2 = frameLayout3.getBackground();
        GradientDrawable gradientDrawable2 = (GradientDrawable) background2.mutate();
        gradientDrawable2.setColor(ContextCompat.getColor(this,R.color.color_female));

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
