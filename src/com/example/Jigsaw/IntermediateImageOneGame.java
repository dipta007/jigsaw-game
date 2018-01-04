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

public class IntermediateImageOneGame extends Activity {
    /**
     * Called when the activity is first created.
     */
    LinearLayout.LayoutParams clicked,nonClicked;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    LinearLayout lsquare;
    boolean[] flg;
    private Integer moveCounter;
    TextView moveCounterShow;
    MediaPlayer swapSound;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate_image_one_game);
        initialize();
        setText();
    }

    public void initialize()
    {
        clicked = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT,2);
        clicked.setMargins(0,0,0,0);
        nonClicked = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT,2);
        nonClicked.setMargins(4,4,4,4);

        swapSound = MediaPlayer.create(IntermediateImageOneGame.this,R.raw.swap);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);

        moveCounterShow = (TextView) findViewById(R.id.textViewMoveCounter);
        moveCounter=0;
        moveCounterShow.setText("Moves: "+moveCounter.toString());

        int width = this.getResources().getDisplayMetrics().widthPixels;
        lsquare = (LinearLayout) findViewById(R.id.linearSquare);
        lsquare.measure(1,1);
        int size = lsquare.getMeasuredWidth();
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width,width);
        lsquare.setLayoutParams(params);

        flg = new boolean[10];
        for(int i=0; i<10 ; i++)
        {
            flg[i] = false;
        }
    }

    private void setText()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Button> arrB = new ArrayList<Button>();
        arrB.add(btn1);arrB.add(btn2);arrB.add(btn3);
        arrB.add(btn4);arrB.add(btn5);arrB.add(btn6);
        arrB.add(btn7);arrB.add(btn8);arrB.add(btn9);
        for(Integer i =1;i<=9;i++)
        {
            arr.add(i);
        }
        Collections.shuffle(arr);
        for(int i=0;i<9;i++)
        {
            switch (arr.get(i))
            {
                case 1:
                    arrB.get(i).setText("image1");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_1));
                    break;
                case 2:
                    arrB.get(i).setText("image2");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_2));
                    break;
                case 3:
                    arrB.get(i).setText("image3");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_3));
                    break;
                case 4:
                    arrB.get(i).setText("image4");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_4));
                    break;
                case 5:
                    arrB.get(i).setText("image5");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_5));
                    break;
                case 6:
                    arrB.get(i).setText("image6");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_6));
                    break;
                case 7:
                    arrB.get(i).setText("image7");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_7));
                    break;
                case 8:
                    arrB.get(i).setText("image8");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_8));
                    break;
                case 9:
                    arrB.get(i).setText("image9");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.int_image1_9));
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
                btn1.setLayoutParams(nonClicked);
            }
            else if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s1 = btn1.getText().toString();
                String s4 = btn4.getText().toString();
                btn1.setText(s4);
                btn4.setText(s1);

                Drawable img1 = btn1.getBackground();
                Drawable img4 = btn4.getBackground();
                btn1.setBackgroundDrawable(img4);
                btn4.setBackgroundDrawable(img1);

                flg[1]=false;
                moveCount();
                btn1.setLayoutParams(nonClicked);
            }
            else
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
            else if(V.getId()==R.id.button3){
                if(SoundHelper.isState()) swapSound.start();

                String s2 = btn2.getText().toString();
                String s3 = btn3.getText().toString();
                btn2.setText(s3);
                btn3.setText(s2);

                Drawable img2 = btn2.getBackground();
                Drawable img3 = btn3.getBackground();
                btn2.setBackgroundDrawable(img3);
                btn3.setBackgroundDrawable(img2);

                flg[2]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s2 = btn2.getText().toString();
                String s5 = btn5.getText().toString();
                btn5.setText(s2);
                btn2.setText(s5);

                Drawable img2 = btn2.getBackground();
                Drawable img5 = btn5.getBackground();
                btn2.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img2);

                flg[2]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[3])
        {
            if(V.getId()==R.id.button2){
                if(SoundHelper.isState()) swapSound.start();

                String s3 = btn3.getText().toString();
                String s2 = btn2.getText().toString();
                btn2.setText(s3);
                btn3.setText(s2);

                Drawable img3 = btn3.getBackground();
                Drawable img2 = btn2.getBackground();
                btn3.setBackgroundDrawable(img2);
                btn2.setBackgroundDrawable(img3);

                flg[3]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s3 = btn3.getText().toString();
                String s6 = btn6.getText().toString();
                btn6.setText(s3);
                btn3.setText(s6);

                Drawable img3 = btn3.getBackground();
                Drawable img6 = btn6.getBackground();
                btn3.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img3);

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
            if(V.getId()==R.id.button1){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s1 = btn1.getText().toString();
                btn4.setText(s1);
                btn1.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img1 = btn1.getBackground();
                btn4.setBackgroundDrawable(img1);
                btn1.setBackgroundDrawable(img4);

                flg[4]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s5 = btn5.getText().toString();
                btn4.setText(s5);
                btn5.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img5 = btn5.getBackground();
                btn4.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img4);

                flg[4]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button7){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s7 = btn7.getText().toString();
                btn4.setText(s7);
                btn7.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img7 = btn7.getBackground();
                btn4.setBackgroundDrawable(img7);
                btn7.setBackgroundDrawable(img4);

                flg[4]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[5])
        {
            if(V.getId()==R.id.button2){
                if(SoundHelper.isState()) swapSound.start();

                String s5 = btn5.getText().toString();
                String s2 = btn2.getText().toString();
                btn5.setText(s2);
                btn2.setText(s5);

                Drawable img5 = btn5.getBackground();
                Drawable img2 = btn2.getBackground();
                btn5.setBackgroundDrawable(img2);
                btn2.setBackgroundDrawable(img5);

                flg[5]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s5 = btn5.getText().toString();
                btn4.setText(s5);
                btn5.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img5 = btn5.getBackground();
                btn4.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img4);

                flg[5]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s5 = btn5.getText().toString();
                String s6 = btn6.getText().toString();
                btn5.setText(s6);
                btn6.setText(s5);

                Drawable img5 = btn5.getBackground();
                Drawable img6 = btn6.getBackground();
                btn5.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img5);

                flg[5]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button8){
                if(SoundHelper.isState()) swapSound.start();

                String s5 = btn5.getText().toString();
                String s8 = btn8.getText().toString();
                btn5.setText(s8);
                btn8.setText(s5);

                Drawable img5 = btn5.getBackground();
                Drawable img8 = btn8.getBackground();
                btn5.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img5);

                flg[5]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[6])
        {
            if(V.getId()==R.id.button3){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s3 = btn3.getText().toString();
                btn6.setText(s3);
                btn3.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img3 = btn3.getBackground();
                btn6.setBackgroundDrawable(img3);
                btn3.setBackgroundDrawable(img6);

                flg[6]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s5 = btn5.getText().toString();
                btn6.setText(s5);
                btn5.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img5 = btn5.getBackground();
                btn6.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img6);

                flg[6]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button9){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s9 = btn9.getText().toString();
                btn6.setText(s9);
                btn9.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img9 = btn9.getBackground();
                btn6.setBackgroundDrawable(img9);
                btn9.setBackgroundDrawable(img6);

                flg[6]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[7])
        {
            if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s7 = btn7.getText().toString();
                String s4 = btn4.getText().toString();
                btn7.setText(s4);
                btn4.setText(s7);

                Drawable img7 = btn7.getBackground();
                Drawable img4 = btn4.getBackground();
                btn7.setBackgroundDrawable(img4);
                btn4.setBackgroundDrawable(img7);

                flg[7]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button8){
                if(SoundHelper.isState()) swapSound.start();

                String s7 = btn7.getText().toString();
                String s8 = btn8.getText().toString();
                btn7.setText(s8);
                btn8.setText(s7);

                Drawable img7 = btn7.getBackground();
                Drawable img8 = btn8.getBackground();
                btn7.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img7);

                flg[7]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[8])
        {
            if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s8 = btn8.getText().toString();
                String s5 = btn5.getText().toString();
                btn8.setText(s5);
                btn5.setText(s8);

                Drawable img8 = btn8.getBackground();
                Drawable img5 = btn5.getBackground();
                btn8.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img8);

                flg[8]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button7){
                if(SoundHelper.isState()) swapSound.start();

                String s8 = btn8.getText().toString();
                String s7 = btn7.getText().toString();
                btn8.setText(s7);
                btn7.setText(s8);

                Drawable img7 = btn7.getBackground();
                Drawable img8 = btn8.getBackground();
                btn7.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img7);

                flg[8]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button9){
                if(SoundHelper.isState()) swapSound.start();

                String s8 = btn8.getText().toString();
                String s9 = btn9.getText().toString();
                btn8.setText(s9);
                btn9.setText(s8);

                Drawable img9 = btn9.getBackground();
                Drawable img8 = btn8.getBackground();
                btn9.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img9);

                flg[8]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[9])
        {
            if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s9 = btn9.getText().toString();
                String s6 = btn6.getText().toString();
                btn9.setText(s6);
                btn6.setText(s9);

                Drawable img9 = btn9.getBackground();
                Drawable img6 = btn6.getBackground();
                btn9.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img9);

                flg[9]=false;
                moveCount();
            }
            if(V.getId()==R.id.button8){
                if(SoundHelper.isState()) swapSound.start();

                String s9 = btn9.getText().toString();
                String s8 = btn8.getText().toString();
                btn9.setText(s8);
                btn8.setText(s9);

                Drawable img9 = btn9.getBackground();
                Drawable img8 = btn8.getBackground();
                btn9.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img9);

                flg[9]=false;
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
                btn1.animate();
                btn1.setLayoutParams(clicked);
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
            } else if(V.getId()==R.id.button5)
            {
                flg[5]=true;
            }
            else if(V.getId()==R.id.button6)
            {
                flg[6]=true;
            }
            else if(V.getId()==R.id.button7)
            {
                flg[7]=true;
            }
            else if(V.getId()==R.id.button8)
            {
                flg[8]=true;
            }
            else if(V.getId()==R.id.button9)
            {
                flg[9]=true;
            }
        }
        if(check())
        {
            swapSound.release();
            int result = 500 - moveCounter;
            saveTheScore(result);
            Intent intent = new Intent(IntermediateImageOneGame.this,Win.class);
            intent.putExtra("score",result);
            startActivity(intent);
        }
    }

    public boolean check()
    {
        boolean res = false;
        if(btn1.getText().toString().compareTo("image1")==0 && btn2.getText().toString().compareTo("image2")==0 && btn3.getText().toString().compareTo("image3")==0
                && btn4.getText().toString().compareTo("image4")==0 && btn5.getText().toString().compareTo("image5")==0 && btn6.getText().toString().compareTo("image6")==0
                && btn7.getText().toString().compareTo("image7")==0 && btn8.getText().toString().compareTo("image8")==0 && btn9.getText().toString().compareTo("image9")==0)
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

        preferenceSettings = getSharedPreferences("high_score", Context.MODE_PRIVATE);
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
