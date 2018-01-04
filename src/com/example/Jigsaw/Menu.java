package com.example.Jigsaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Shubhashis on 1/19/2015 at 4:03 AM.
 */
public class Menu extends Activity {
    Button sound;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SoundHelper.setState(true);
        setContentView(R.layout.menu);
        sound = (Button) findViewById(R.id.buttonSound);
    }

    public void clickOnButton(View V)
    {
        switch (V.getId())
        {
            case R.id.buttonStart:
                //Start Game
                Intent intent = new Intent(Menu.this,Difficulty.class);
                startActivity(intent);
                break;
            case R.id.buttonHigh:
                //High Score
                Intent intent1 = new Intent(Menu.this,HighScore.class);
                startActivity(intent1);
                break;
            case R.id.buttonSound:
                //Settings
                if(SoundHelper.isState())
                {
                    sound.setBackgroundDrawable(getResources().getDrawable(R.drawable.sound_off));
                    SoundHelper.setState(false);
                }
                else
                {
                    sound.setBackgroundDrawable(getResources().getDrawable(R.drawable.sound_on));
                    SoundHelper.setState(true);
                }
                break;
            case R.id.buttonQuit:
                //Quit
                alertDialogue();
                break;
            case R.id.buttonCredits:
                //Who Made it
                Intent intent2 = new Intent(Menu.this,Credits.class);
                startActivity(intent2);
                break;
        }
    }

    public void alertDialogue()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("QUIT");
        alertDialog.setMessage("Are You Sure?");
        alertDialog.setButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialog.setIcon(R.drawable.quit);
        alertDialog.show();
    }
}

