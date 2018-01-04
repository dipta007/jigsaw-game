package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shubhashis on 1/19/2015 at 5:43 AM.
 */
public class Difficulty extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficulty);
    }

    public void clickOnButton(View V)
    {
        switch (V.getId())
        {
            case R.id.buttonBeginner:
                //2X2 game
                Intent intent1 = new Intent(Difficulty.this,BeginnerLevel.class);
                startActivity(intent1);
                break;
            case R.id.buttonIntermediate:
                //3X3 game
                Intent intent2 = new Intent(Difficulty.this,IntermediateLevel.class);
                startActivity(intent2);
                break;
            case R.id.buttonAdvanced:
                //4X4 game
                Intent intent3 = new Intent(Difficulty.this,AdvancedLevel.class);
                startActivity(intent3);
                break;
        }
    }
}