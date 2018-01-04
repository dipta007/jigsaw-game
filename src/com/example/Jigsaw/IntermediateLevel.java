package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shubhashis on 1/19/2015 at 9:59 AM.
 */
public class IntermediateLevel extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate_level);
    }

    public void clickOnButton(View V)
    {
        switch (V.getId())
        {
            case R.id.buttonIntImage1:
                Intent intent = new Intent(IntermediateLevel.this,IntermediateImageOne.class);
                startActivity(intent);
                break;
            case R.id.buttonIntImage2:

                break;
            case R.id.buttonIntImage3:

                break;
        }
    }
}