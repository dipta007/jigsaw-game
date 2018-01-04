package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteProgram;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
    /**
     * Called when the activity is first created.
     */
    MediaPlayer splashSound;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        splashSound = MediaPlayer.create(Splash.this,R.raw.splash);
        splashSound.start();
        Thread timer = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(1900);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Splash.this,Menu.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        splashSound.release();
        finish();
    }
}
