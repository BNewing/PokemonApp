package com.example.beverleynewing.cookieclicker;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imgPokemon = (ImageView)findViewById(R.id.charmander);
        final TextView textCounter = (TextView)findViewById(R.id.counter);

        imgPokemon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                currentScore ++;
                textCounter.setText("Your current score is " + currentScore);

                if(currentScore == 10){
                    imgPokemon.animate().scaleX(0).scaleY(0).rotation(360).setDuration(1000).setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animator) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            imgPokemon.setImageResource(R.drawable.charmeleon);

//                            imgCharmander.animate().cancel();
                            imgPokemon.animate().rotation(360).scaleX(1f).scaleY(1f).setDuration(1000).start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animator) {

                        }
                    }).start();
                }
                else if(currentScore == 20){
                    imgPokemon.animate().cancel();
                    imgPokemon.animate().scaleX(0).scaleY(0).rotation(360).setDuration(1000).setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animator) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
//                            animator.end();
                            imgPokemon.setImageResource(R.drawable.charizard);
                            imgPokemon.animate().cancel();
                            imgPokemon.animate().scaleX(1f).scaleY(1f).rotation(360).setDuration(1000).start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animator) {

                        }
                    }).start();
                }
        }
    });
}}
