package com.example.temitopeolutadepc.tic_tac_toe_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //0 represents yellow while 1 represents red and 2 means empty
    //boolean activeball=true;

    int activeball= 0;

    int[] gameState={2,2,2,2,2,2,2,2,2};

    int [][] winningPositions ={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};


    public void putin(View view){

        ImageView counter = (ImageView) view;

        Log.i(" numner",counter.getTag().toString());

        int tappedCounter=Integer.parseInt(counter.getTag().toString());

        gameState[tappedCounter]=activeball;//identify what color is in each box

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

        String winner =" ";

        for(int[] winningPosition :winningPositions ){
            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&  gameState[winningPosition[1]]== gameState[winningPosition[2]] && gameState[winningPosition[0]] !=2);

                //This line compares the gamestate with the winningPosition to see if they all have the same colour of ball
            if (activeball==1){
                winner ="Yellow";
            }
            else {
                winner ="Red";
            }

            Toast.makeText(this,winner + "Has won " , Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
