package com.msalah.animationtest;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimatedVectorDrawable mightyMorphinAnimatedVectorDrawable;
    private ImageView animatorImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animatorImageView = (ImageView) findViewById(R.id.path_morph_animated_vector);
        mightyMorphinAnimatedVectorDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animated_vector);


        animatorImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                morph();
            }
        });

    }

    private void morph() {

        animatorImageView.setImageDrawable(mightyMorphinAnimatedVectorDrawable);
        mightyMorphinAnimatedVectorDrawable.start();
    }
}
