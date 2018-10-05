package com.example.temitopeolutadepc.tic_tac_toe_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void putin(View view){
        ImageView counter = (ImageView) view;
        counter.setTranslationY(-1500);//takes the image above the screen
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationYBy(1500).setDuration(300);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
