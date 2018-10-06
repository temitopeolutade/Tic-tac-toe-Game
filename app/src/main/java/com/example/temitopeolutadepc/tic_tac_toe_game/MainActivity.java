package com.example.temitopeolutadepc.tic_tac_toe_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //0 represents yellow while 1 represents red and 2 means empty
    //boolean activeball=true;

    int activeball= 0;

    int[] gameState={2,2,2,2,2,2,2,2,2};


    public void putin(View view){

        ImageView counter = (ImageView) view;

        Log.i(" numner",counter.getTag().toString());

        int tappedCounter=Integer.parseInt(counter.getTag().toString());
        gameState[tappedCounter]=activeball;

        counter.setTranslationY(-1500);//takes the image above the screen

        if (activeball==0) {

            counter.setImageResource(R.drawable.yellow);
           activeball=1;
        }
        else{
            counter.setImageResource(R.drawable.red);
            activeball=0;
        }

      /** if (activeball){
           counter.setImageResource(R.drawable.yellow);
           activeball=false;
       }
       else{
           counter.setImageResource(R.drawable.red);
           activeball=true;
       }**/

        counter.animate().translationYBy(1500).setDuration(300);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
