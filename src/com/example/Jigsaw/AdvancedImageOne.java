package com.example.Jigsaw;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Shubhashis on 1/19/2015 at 8:19 AM.
 */

//jst pic ta koyek second er jonno dekhabe
public class AdvancedImageOne extends Activity {
    boolean flg;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_image_one);
        flg=true;
        Thread timer =new Thread()
        {
            @Override
            public void run() {
                try{
                    sleep(10000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    if(flg) {
                        Intent intent = new Intent(AdvancedImageOne.this, BeginnerImageOneGame.class);
                        startActivity(intent);
                    }
                }
            }
        };
        timer.start();
    }
    public void clickOnButton(View V)
    {
        if(V.getId()==R.id.skip1)
        {
            flg=false;
            Intent intent = new Intent(AdvancedImageOne.this,AdvancedImageOneGame.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}