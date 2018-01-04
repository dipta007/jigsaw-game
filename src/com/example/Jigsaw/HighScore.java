package com.example.Jigsaw;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.Pipe;
import java.security.PrivateKey;

/**
 * Created by Shubhashis on 1/20/2015 at 3:20 AM.
 */
public class HighScore extends Activity {

    TextView high,medium,low;
    private SharedPreferences preferenceSetting;
    private SharedPreferences.Editor preferenceEditor;
    private static final int PREFERENCE_MODE_PRIVATE = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.high_score);
        initialize();
        set();
    }

    public void initialize()
    {
        high = (TextView) findViewById(R.id.textViewHigh);
        medium = (TextView) findViewById(R.id.textViewMedium);
        low = (TextView) findViewById(R.id.textViewLow);
        preferenceSetting = getSharedPreferences("high_score", Context.MODE_PRIVATE);
        preferenceEditor=preferenceSetting.edit();
    }

    public void set()
    {
        Integer highScore = (Integer) preferenceSetting.getInt("number1",0);
        Integer mediumScore = (Integer) preferenceSetting.getInt("number2",0);
        Integer lowScore = (Integer) preferenceSetting.getInt("number3",0);

        high.setText("1. "+highScore.toString());
        medium.setText("2. "+mediumScore.toString());
        low.setText("3. "+lowScore.toString());
    }

    public void clickOnButton(View V)
    {
        if(V.getId()==R.id.buttonReset)
        {
            preferenceEditor.clear();
            preferenceEditor.apply();
            set();
        }
    }
}