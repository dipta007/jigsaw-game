package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shubhashis on 1/19/2015 at 7:05 AM.
 */
public class AdvancedLevel extends Activity {
    Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_level);
    }

    public void clickOnButton(View V)
    {
        switch (V.getId())
        {
            case R.id.buttonAdvImage1:
                Intent intent = new Intent(AdvancedLevel.this,AdvancedImageOne.class);
                startActivity(intent);
                break;
            case R.id.buttonAdvImage2:

                break;
            case R.id.buttonBegImage3:

                break;
        }
    }
}