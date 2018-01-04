package com.example.Jigsaw;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import android.app.ActionBar;
import android.graphics.Color;
import android.text.BoringLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.Collections;

public class BeginnerImageOneGame extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button btn1,btn2,btn3,btn4;
    LinearLayout lsquare;
    boolean[] flg;
    private Integer moveCounter;
    TextView moveCounterShow;
    MediaPlayer swapSound;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_image_one_game);
        initialize();
        setText();
    }

    public void initialize()
    {
        swapSound = MediaPlayer.create(BeginnerImageOneGame.this,R.raw.swap);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        moveCounterShow = (TextView) findViewById(R.id.textViewMoveCounter);
        moveCounter=0;
        moveCounterShow.setText("Moves: "+moveCounter.toString());

        int width = this.getResources().getDisplayMetrics().widthPixels;
        lsquare = (LinearLayout) findViewById(R.id.linearSquare);
        lsquare.measure(1,1);
        int size = lsquare.getMeasuredWidth();
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width,width);
        lsquare.setLayoutParams(params);

        flg = new boolean[5];
        for(int i=0; i<5 ; i++)
        {
            flg[i] = false;
        }
    }

    private void setText()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Button> arrB = new ArrayList<Button>();
        arrB.add(btn1);arrB.add(btn2);arrB.add(btn3);arrB.add(btn4);
        for(Integer i =1;i<=4;i++)
        {
            arr.add(i);
        }
        Collections.shuffle(arr);
        for(int i=0;i<4;i++)
        {
            switch (arr.get(i))
            {
                case 1:
                    arrB.get(i).setText("image1");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.beg_image1_1));
                    break;
                case 2:
                    arrB.get(i).setText("image2");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.beg_image1_2));
                    break;
                case 3:
                    arrB.get(i).setText("image3");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.beg_image1_3));
                    break;
                case 4:
                    arrB.get(i).setText("image4");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.beg_image1_4));
                    break;
            }
            arrB.get(i).setTextColor(Color.TRANSPARENT);
        }
    }

    public void clickOnButton(View V)
    {
        if(flg[1])
        {
            if(V.getId()==R.id.button2){
                if(SoundHelper.isState()) swapSound.start();

                String s1 = btn1.getText().toString();
                String s2 = btn2.getText().toString();
                btn1.setText(s2);
                btn2.setText(s1);

                Drawable img1 = btn1.getBackground();
                Drawable img2 = btn2.getBackground();
                btn1.setBackgroundDrawable(img2);
                btn2.setBackgroundDrawable(img1);

                flg[1]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button3){
                if(SoundHelper.isState()) swapSound.start();

                String s1 = btn1.getText().toString();
                String s3 = btn3.getText().toString();
                btn1.setText(s3);
                btn3.setText(s1);

                Drawable img1 = btn1.getBackground();
                Drawable img3 = btn3.getBackground();
                btn1.setBackgroundDrawable(img3);
                btn3.setBackgroundDrawable(img1);

                flg[1]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button4)
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }

        }
        else if(flg[2])
        {
            if(V.getId()==R.id.button1){
                if(SoundHelper.isState()) swapSound.start();

                String s2 = btn2.getText().toString();
                String s1 = btn1.getText().toString();
                btn1.setText(s2);
                btn2.setText(s1);

                Drawable img2 = btn2.getBackground();
                Drawable img1 = btn1.getBackground();
                btn2.setBackgroundDrawable(img1);
                btn1.setBackgroundDrawable(img2);

                flg[2]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s2 = btn2.getText().toString();
                String s4 = btn4.getText().toString();
                btn4.setText(s2);
                btn2.setText(s4);

                Drawable img2 = btn2.getBackground();
                Drawable img4 = btn4.getBackground();
                btn2.setBackgroundDrawable(img4);
                btn4.setBackgroundDrawable(img2);

                flg[2]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button3)
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[3])
        {
            if(V.getId()==R.id.button1){
                if(SoundHelper.isState()) swapSound.start();

                String s3 = btn3.getText().toString();
                String s1 = btn1.getText().toString();
                btn1.setText(s3);
                btn3.setText(s1);

                Drawable img3 = btn3.getBackground();
                Drawable img1 = btn1.getBackground();
                btn3.setBackgroundDrawable(img1);
                btn1.setBackgroundDrawable(img3);

                flg[3]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s3 = btn3.getText().toString();
                String s4 = btn4.getText().toString();
                btn4.setText(s3);
                btn3.setText(s4);

                Drawable img3 = btn3.getBackground();
                Drawable img4 = btn4.getBackground();
                btn3.setBackgroundDrawable(img4);
                btn4.setBackgroundDrawable(img3);

                flg[3]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }

        }
        else if(flg[4])
        {
            if(V.getId()==R.id.button2){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s2 = btn2.getText().toString();
                btn4.setText(s2);
                btn2.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img2 = btn2.getBackground();
                btn4.setBackgroundDrawable(img2);
                btn2.setBackgroundDrawable(img4);

                flg[4]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button3){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s3 = btn3.getText().toString();
                btn4.setText(s3);
                btn3.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img3 = btn3.getBackground();
                btn4.setBackgroundDrawable(img3);
                btn3.setBackgroundDrawable(img4);

                flg[4]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            if(V.getId()==R.id.button1)
            {
                flg[1]=true;
            }
            else if(V.getId()==R.id.button2)
            {
                flg[2]=true;
            }
            else if(V.getId()==R.id.button3)
            {
                flg[3]=true;
            }
            else if(V.getId()==R.id.button4)
            {
                flg[4]=true;
            }
        }
        if(check())
        {
            swapSound.release();
            int result = 100 - moveCounter;
            saveTheScore(result);
            Intent intent = new Intent(BeginnerImageOneGame.this,Win.class);
            intent.putExtra("score",result);
            startActivity(intent);
        }
    }

    public boolean check()
    {
        boolean res = false;
        if(btn1.getText().toString().compareTo("image1")==0 && btn2.getText().toString().compareTo("image2")==0 && btn3.getText().toString().compareTo("image3")==0 && btn4.getText().toString().compareTo("image4")==0)
            res = true;
        return res;
    }

    public void moveCount()
    {
        moveCounter++;
        moveCounterShow.setText("Moves: "+moveCounter.toString());
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public void saveTheScore(int number)
    {
        SharedPreferences preferenceSettings;
        SharedPreferences.Editor preferenceEditor;

        preferenceSettings = getSharedPreferences("high_score",Context.MODE_PRIVATE);
        preferenceEditor = preferenceSettings.edit();

        int no1 = preferenceSettings.getInt("number1", 0);
        int no2 = preferenceSettings.getInt("number2", 0);
        int no3 = preferenceSettings.getInt("number3", 0);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add((Integer)no1);
        arr.add((Integer)no2);
        arr.add((Integer)no3);
        arr.add((Integer)number);
        Collections.sort(arr,Collections.reverseOrder());

        String tagName[] = new String[3];
        tagName[0] = "number1";
        tagName[1] = "number2";
        tagName[2] = "number3";

        for(int i=0;i<3;i++)
        {
            Log.w("app",arr.get(i).toString());
            preferenceEditor.putInt(tagName[i],arr.get(i));
        }
        preferenceEditor.apply();
    }
}
