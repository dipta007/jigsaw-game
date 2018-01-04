package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.TextView;

/**
 * Created by Shubhashis on 1/19/2015 at 9:13 AM.
 */
public class Win extends Activity {
    TextView finalScore;
    MediaPlayer winSound;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win);

        finalScore = (TextView) findViewById(R.id.textViewFinalScore);
        winSound = MediaPlayer.create(Win.this,R.raw.clap);
        if(SoundHelper.isState()) winSound.start();
        Intent intent = getIntent();
        Integer result = (Integer) intent.getIntExtra("score",0);
        finalScore.setText(result.toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        winSound.release();
        finish();
    }
}