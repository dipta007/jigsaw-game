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

public class AdvancedImageOneGame extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    LinearLayout lsquare;
    boolean[] flg;
    private Integer moveCounter;
    TextView moveCounterShow;
    MediaPlayer swapSound;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_image_one_game);
        initialize();
        setText();
    }

    public void initialize()
    {
        swapSound = MediaPlayer.create(AdvancedImageOneGame.this,R.raw.swap);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn13 = (Button) findViewById(R.id.button13);
        btn14 = (Button) findViewById(R.id.button14);
        btn15 = (Button) findViewById(R.id.button15);
        btn16 = (Button) findViewById(R.id.button16);

        moveCounterShow = (TextView) findViewById(R.id.textViewMoveCounter);
        moveCounter=0;
        moveCounterShow.setText("Moves: "+moveCounter.toString());

        int width = this.getResources().getDisplayMetrics().widthPixels;
        int length = this.getResources().getDisplayMetrics().heightPixels;
        lsquare = (LinearLayout) findViewById(R.id.linearSquare);
        lsquare.measure(1,1);
        int size = lsquare.getMeasuredWidth();
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(width,width);
        lsquare.setLayoutParams(params);

        flg = new boolean[17];
        for(int i=0; i<17 ; i++)
        {
            flg[i] = false;
        }
    }

    private void setText()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Button> arrB = new ArrayList<Button>();
        arrB.add(btn1);arrB.add(btn2);arrB.add(btn3);arrB.add(btn4);
        arrB.add(btn5);arrB.add(btn6);arrB.add(btn7);arrB.add(btn8);
        arrB.add(btn9);arrB.add(btn10);arrB.add(btn11);arrB.add(btn12);
        arrB.add(btn13);arrB.add(btn14);arrB.add(btn15);arrB.add(btn16);

        for(Integer i =1;i<=16;i++)
        {
            arr.add(i);
        }
        Collections.shuffle(arr);
        for(int i=0;i<16;i++)
        {
            switch (arr.get(i))
            {
                case 1:
                    arrB.get(i).setText("image1");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_1));
                    break;
                case 2:
                    arrB.get(i).setText("image2");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_2));
                    break;
                case 3:
                    arrB.get(i).setText("image3");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_3));
                    break;
                case 4:
                    arrB.get(i).setText("image4");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_4));
                    break;
                case 5:
                    arrB.get(i).setText("image5");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_5));
                    break;
                case 6:
                    arrB.get(i).setText("image6");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_6));
                    break;
                case 7:
                    arrB.get(i).setText("image7");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_7));
                    break;
                case 8:
                    arrB.get(i).setText("image8");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_8));
                    break;
                case 9:
                    arrB.get(i).setText("image9");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_9));
                    break;
                case 10:
                    arrB.get(i).setText("image10");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_10));
                    break;
                case 11:
                    arrB.get(i).setText("image11");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_11));
                    break;
                case 12:
                    arrB.get(i).setText("image12");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_12));
                    break;
                case 13:
                    arrB.get(i).setText("image13");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_13));
                    break;
                case 14:
                    arrB.get(i).setText("image14");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_14));
                    break;
                case 15:
                    arrB.get(i).setText("image15");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_15));
                    break;
                case 16:
                    arrB.get(i).setText("image16");
                    arrB.get(i).setBackgroundDrawable(getResources().getDrawable(R.drawable.adv_image1_16));
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
            else if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s1 = btn1.getText().toString();
                String s5 = btn5.getText().toString();
                btn1.setText(s5);
                btn5.setText(s1);

                Drawable img1 = btn1.getBackground();
                Drawable img5 = btn5.getBackground();
                btn1.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img1);

                flg[1]=false;
                moveCount();
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
            else if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s2 = btn2.getText().toString();
                String s6 = btn6.getText().toString();
                btn6.setText(s2);
                btn2.setText(s6);

                Drawable img2 = btn2.getBackground();
                Drawable img6 = btn6.getBackground();
                btn2.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img2);

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
            else if(V.getId()==R.id.button7){
                if(SoundHelper.isState()) swapSound.start();

                String s3 = btn3.getText().toString();
                String s7 = btn7.getText().toString();
                btn7.setText(s3);
                btn3.setText(s7);

                Drawable img3 = btn3.getBackground();
                Drawable img7 = btn7.getBackground();
                btn3.setBackgroundDrawable(img7);
                btn7.setBackgroundDrawable(img3);

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
            if(V.getId()==R.id.button3){
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
            else if(V.getId()==R.id.button8){
                if(SoundHelper.isState()) swapSound.start();

                String s4 = btn4.getText().toString();
                String s8 = btn8.getText().toString();
                btn4.setText(s8);
                btn8.setText(s4);

                Drawable img4 = btn4.getBackground();
                Drawable img8 = btn8.getBackground();
                btn4.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img4);

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
            if(V.getId()==R.id.button1){
                if(SoundHelper.isState()) swapSound.start();

                String s5 = btn5.getText().toString();
                String s1 = btn1.getText().toString();
                btn5.setText(s1);
                btn1.setText(s5);

                Drawable img5 = btn5.getBackground();
                Drawable img1 = btn1.getBackground();
                btn5.setBackgroundDrawable(img1);
                btn1.setBackgroundDrawable(img5);

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
            else if(V.getId()==R.id.button9){
                if(SoundHelper.isState()) swapSound.start();

                String s5 = btn5.getText().toString();
                String s9 = btn9.getText().toString();
                btn5.setText(s9);
                btn9.setText(s5);

                Drawable img5 = btn5.getBackground();
                Drawable img9 = btn9.getBackground();
                btn5.setBackgroundDrawable(img9);
                btn9.setBackgroundDrawable(img5);

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
            if(V.getId()==R.id.button2){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s2 = btn2.getText().toString();
                btn6.setText(s2);
                btn2.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img2 = btn2.getBackground();
                btn6.setBackgroundDrawable(img2);
                btn2.setBackgroundDrawable(img6);

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
            else if(V.getId()==R.id.button7){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s7 = btn7.getText().toString();
                btn6.setText(s7);
                btn7.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img7 = btn7.getBackground();
                btn6.setBackgroundDrawable(img7);
                btn7.setBackgroundDrawable(img6);

                flg[6]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button10){
                if(SoundHelper.isState()) swapSound.start();

                String s6 = btn6.getText().toString();
                String s10 = btn10.getText().toString();
                btn6.setText(s10);
                btn10.setText(s6);

                Drawable img6 = btn6.getBackground();
                Drawable img10 = btn10.getBackground();
                btn6.setBackgroundDrawable(img10);
                btn10.setBackgroundDrawable(img6);

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
            if(V.getId()==R.id.button3){
                if(SoundHelper.isState()) swapSound.start();

                String s7 = btn7.getText().toString();
                String s3 = btn3.getText().toString();
                btn7.setText(s3);
                btn3.setText(s7);

                Drawable img7 = btn7.getBackground();
                Drawable img3 = btn3.getBackground();
                btn7.setBackgroundDrawable(img3);
                btn3.setBackgroundDrawable(img7);

                flg[7]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s7 = btn7.getText().toString();
                String s6 = btn6.getText().toString();
                btn7.setText(s6);
                btn6.setText(s7);

                Drawable img7 = btn7.getBackground();
                Drawable img6 = btn6.getBackground();
                btn7.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img7);

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
            else if(V.getId()==R.id.button11){
                if(SoundHelper.isState()) swapSound.start();

                String s7 = btn7.getText().toString();
                String s11 = btn11.getText().toString();
                btn7.setText(s11);
                btn11.setText(s7);

                Drawable img7 = btn7.getBackground();
                Drawable img11 = btn11.getBackground();
                btn7.setBackgroundDrawable(img11);
                btn11.setBackgroundDrawable(img7);

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
            if(V.getId()==R.id.button4){
                if(SoundHelper.isState()) swapSound.start();

                String s8 = btn8.getText().toString();
                String s4 = btn4.getText().toString();
                btn8.setText(s4);
                btn4.setText(s8);

                Drawable img8 = btn8.getBackground();
                Drawable img4 = btn4.getBackground();
                btn8.setBackgroundDrawable(img4);
                btn4.setBackgroundDrawable(img8);

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
            else if(V.getId()==R.id.button12){
                if(SoundHelper.isState()) swapSound.start();

                String s8 = btn8.getText().toString();
                String s12 = btn12.getText().toString();
                btn8.setText(s12);
                btn12.setText(s8);

                Drawable img12 = btn12.getBackground();
                Drawable img8 = btn8.getBackground();
                btn12.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img12);

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
            if(V.getId()==R.id.button5){
                if(SoundHelper.isState()) swapSound.start();

                String s9 = btn9.getText().toString();
                String s5 = btn5.getText().toString();
                btn9.setText(s5);
                btn5.setText(s9);

                Drawable img9 = btn9.getBackground();
                Drawable img5 = btn5.getBackground();
                btn9.setBackgroundDrawable(img5);
                btn5.setBackgroundDrawable(img9);

                flg[9]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button10){
                if(SoundHelper.isState()) swapSound.start();

                String s9 = btn9.getText().toString();
                String s10 = btn10.getText().toString();
                btn9.setText(s10);
                btn10.setText(s9);

                Drawable img9 = btn9.getBackground();
                Drawable img10 = btn10.getBackground();
                btn9.setBackgroundDrawable(img10);
                btn10.setBackgroundDrawable(img9);

                flg[9]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button13){
                if(SoundHelper.isState()) swapSound.start();

                String s9 = btn9.getText().toString();
                String s13 = btn13.getText().toString();
                btn9.setText(s13);
                btn13.setText(s9);

                Drawable img9 = btn9.getBackground();
                Drawable img13 = btn13.getBackground();
                btn9.setBackgroundDrawable(img13);
                btn13.setBackgroundDrawable(img9);

                flg[9]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[10])
        {
            if(V.getId()==R.id.button6){
                if(SoundHelper.isState()) swapSound.start();

                String s10 = btn10.getText().toString();
                String s6 = btn6.getText().toString();
                btn10.setText(s6);
                btn6.setText(s10);

                Drawable img10 = btn10.getBackground();
                Drawable img6 = btn6.getBackground();
                btn10.setBackgroundDrawable(img6);
                btn6.setBackgroundDrawable(img10);

                flg[10]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button9){
                if(SoundHelper.isState()) swapSound.start();

                String s10 = btn10.getText().toString();
                String s9 = btn9.getText().toString();
                btn10.setText(s9);
                btn9.setText(s10);

                Drawable img10 = btn10.getBackground();
                Drawable img9 = btn9.getBackground();
                btn10.setBackgroundDrawable(img9);
                btn9.setBackgroundDrawable(img10);

                flg[10]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button11){
                if(SoundHelper.isState()) swapSound.start();

                String s10 = btn10.getText().toString();
                String s11 = btn11.getText().toString();
                btn10.setText(s11);
                btn11.setText(s10);

                Drawable img10 = btn10.getBackground();
                Drawable img11 = btn11.getBackground();
                btn10.setBackgroundDrawable(img11);
                btn11.setBackgroundDrawable(img10);

                flg[10]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button14){
                if(SoundHelper.isState()) swapSound.start();

                String s10 = btn10.getText().toString();
                String s14 = btn14.getText().toString();
                btn10.setText(s14);
                btn14.setText(s10);

                Drawable img10 = btn10.getBackground();
                Drawable img14 = btn14.getBackground();
                btn10.setBackgroundDrawable(img14);
                btn14.setBackgroundDrawable(img10);

                flg[10]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[11])
        {
            if(V.getId()==R.id.button7){
                if(SoundHelper.isState()) swapSound.start();

                String s11 = btn11.getText().toString();
                String s7 = btn7.getText().toString();
                btn11.setText(s7);
                btn7.setText(s11);

                Drawable img11 = btn11.getBackground();
                Drawable img7 = btn7.getBackground();
                btn11.setBackgroundDrawable(img7);
                btn7.setBackgroundDrawable(img11);

                flg[11]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button10){
                if(SoundHelper.isState()) swapSound.start();

                String s11 = btn11.getText().toString();
                String s10 = btn10.getText().toString();
                btn11.setText(s10);
                btn10.setText(s11);

                Drawable img11 = btn11.getBackground();
                Drawable img10 = btn10.getBackground();
                btn11.setBackgroundDrawable(img10);
                btn10.setBackgroundDrawable(img11);

                flg[11]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button12){
                if(SoundHelper.isState()) swapSound.start();

                String s11 = btn11.getText().toString();
                String s12 = btn12.getText().toString();
                btn11.setText(s12);
                btn12.setText(s11);

                Drawable img11 = btn11.getBackground();
                Drawable img12 = btn12.getBackground();
                btn11.setBackgroundDrawable(img12);
                btn12.setBackgroundDrawable(img11);

                flg[11]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button15){
                if(SoundHelper.isState()) swapSound.start();

                String s11 = btn11.getText().toString();
                String s15 = btn15.getText().toString();
                btn11.setText(s15);
                btn15.setText(s11);

                Drawable img11 = btn11.getBackground();
                Drawable img15 = btn15.getBackground();
                btn11.setBackgroundDrawable(img15);
                btn15.setBackgroundDrawable(img11);

                flg[11]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[12])
        {
            if(V.getId()==R.id.button8){
                if(SoundHelper.isState()) swapSound.start();

                String s12 = btn12.getText().toString();
                String s8 = btn8.getText().toString();
                btn12.setText(s8);
                btn8.setText(s12);

                Drawable img12 = btn12.getBackground();
                Drawable img8 = btn8.getBackground();
                btn12.setBackgroundDrawable(img8);
                btn8.setBackgroundDrawable(img12);

                flg[12]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button11){
                if(SoundHelper.isState()) swapSound.start();

                String s12 = btn12.getText().toString();
                String s11 = btn11.getText().toString();
                btn12.setText(s11);
                btn11.setText(s12);

                Drawable img12 = btn12.getBackground();
                Drawable img11 = btn11.getBackground();
                btn12.setBackgroundDrawable(img11);
                btn11.setBackgroundDrawable(img12);

                flg[12]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button16){
                if(SoundHelper.isState()) swapSound.start();

                String s12 = btn12.getText().toString();
                String s16 = btn16.getText().toString();
                btn12.setText(s16);
                btn16.setText(s12);

                Drawable img12 = btn12.getBackground();
                Drawable img16 = btn16.getBackground();
                btn12.setBackgroundDrawable(img16);
                btn16.setBackgroundDrawable(img12);

                flg[12]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[13])
        {
            if(V.getId()==R.id.button9){
                if(SoundHelper.isState()) swapSound.start();

                String s13 = btn13.getText().toString();
                String s9 = btn9.getText().toString();
                btn13.setText(s9);
                btn9.setText(s13);

                Drawable img13 = btn13.getBackground();
                Drawable img9 = btn9.getBackground();
                btn13.setBackgroundDrawable(img9);
                btn9.setBackgroundDrawable(img13);

                flg[13]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button14){
                if(SoundHelper.isState()) swapSound.start();

                String s13 = btn13.getText().toString();
                String s14 = btn14.getText().toString();
                btn13.setText(s14);
                btn14.setText(s13);

                Drawable img13 = btn13.getBackground();
                Drawable img14 = btn14.getBackground();
                btn13.setBackgroundDrawable(img14);
                btn14.setBackgroundDrawable(img13);

                flg[13]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[14])
        {
            if(V.getId()==R.id.button10){
                if(SoundHelper.isState()) swapSound.start();

                String s14 = btn14.getText().toString();
                String s10 = btn10.getText().toString();
                btn14.setText(s10);
                btn10.setText(s14);

                Drawable img14 = btn14.getBackground();
                Drawable img10 = btn10.getBackground();
                btn14.setBackgroundDrawable(img10);
                btn10.setBackgroundDrawable(img14);

                flg[14]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button13){
                if(SoundHelper.isState()) swapSound.start();

                String s14 = btn14.getText().toString();
                String s13 = btn13.getText().toString();
                btn14.setText(s13);
                btn13.setText(s14);

                Drawable img14 = btn14.getBackground();
                Drawable img13 = btn13.getBackground();
                btn14.setBackgroundDrawable(img13);
                btn13.setBackgroundDrawable(img14);

                flg[14]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button15){
                if(SoundHelper.isState()) swapSound.start();

                String s14 = btn14.getText().toString();
                String s15 = btn15.getText().toString();
                btn14.setText(s15);
                btn15.setText(s14);

                Drawable img14 = btn14.getBackground();
                Drawable img15 = btn15.getBackground();
                btn14.setBackgroundDrawable(img15);
                btn15.setBackgroundDrawable(img14);

                flg[14]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[15])
        {
            if(V.getId()==R.id.button11){
                if(SoundHelper.isState()) swapSound.start();

                String s15 = btn15.getText().toString();
                String s11 = btn11.getText().toString();
                btn15.setText(s11);
                btn11.setText(s15);

                Drawable img15 = btn15.getBackground();
                Drawable img11 = btn11.getBackground();
                btn15.setBackgroundDrawable(img11);
                btn11.setBackgroundDrawable(img15);

                flg[15]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button14){
                if(SoundHelper.isState()) swapSound.start();

                String s15 = btn15.getText().toString();
                String s14 = btn14.getText().toString();
                btn15.setText(s14);
                btn14.setText(s15);

                Drawable img15 = btn15.getBackground();
                Drawable img14 = btn14.getBackground();
                btn15.setBackgroundDrawable(img14);
                btn14.setBackgroundDrawable(img15);

                flg[15]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button16){
                if(SoundHelper.isState()) swapSound.start();

                String s15 = btn15.getText().toString();
                String s16 = btn16.getText().toString();
                btn15.setText(s16);
                btn16.setText(s15);

                Drawable img15 = btn15.getBackground();
                Drawable img16 = btn16.getBackground();
                btn15.setBackgroundDrawable(img16);
                btn16.setBackgroundDrawable(img15);

                flg[15]=false;
                moveCount();
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Wrong Move !!\nDon't Try to Cheat",Toast.LENGTH_SHORT).show();
            }
        }
        else if(flg[16])
        {
            if(V.getId()==R.id.button12){
                if(SoundHelper.isState()) swapSound.start();

                String s16 = btn16.getText().toString();
                String s12 = btn12.getText().toString();
                btn16.setText(s12);
                btn12.setText(s16);

                Drawable img16 = btn16.getBackground();
                Drawable img12 = btn12.getBackground();
                btn16.setBackgroundDrawable(img12);
                btn12.setBackgroundDrawable(img16);

                flg[16]=false;
                moveCount();
            }
            else if(V.getId()==R.id.button15){
                if(SoundHelper.isState()) swapSound.start();

                String s16 = btn16.getText().toString();
                String s15 = btn15.getText().toString();
                btn16.setText(s15);
                btn15.setText(s16);

                Drawable img16 = btn16.getBackground();
                Drawable img15 = btn15.getBackground();
                btn16.setBackgroundDrawable(img15);
                btn15.setBackgroundDrawable(img16);

                flg[16]=false;
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
            else if(V.getId()==R.id.button10)
            {
                flg[10]=true;
            }
            else if(V.getId()==R.id.button11)
            {
                flg[11]=true;
            }
            else if(V.getId()==R.id.button12)
            {
                flg[12]=true;
            }
            else if(V.getId()==R.id.button13)
            {
                flg[13]=true;
            }
            else if(V.getId()==R.id.button14)
            {
                flg[14]=true;
            }
            else if(V.getId()==R.id.button15)
            {
                flg[15]=true;
            }
            else if(V.getId()==R.id.button16)
            {
                flg[16]=true;
            }
        }
        if(check())
        {
            swapSound.release();
            int result = 250 - moveCounter;
            saveTheScore(result);
            Intent intent = new Intent(AdvancedImageOneGame.this,Win.class);
            intent.putExtra("score",result);
            startActivity(intent);
        }
    }

    public boolean check()
    {
        boolean res = false;
        if(btn1.getText().toString().compareTo("image1")==0 && btn2.getText().toString().compareTo("image2")==0
                && btn3.getText().toString().compareTo("image3")==0 && btn4.getText().toString().compareTo("image4")==0
                && btn5.getText().toString().compareTo("image5")==0 && btn6.getText().toString().compareTo("image6")==0
                && btn7.getText().toString().compareTo("image7")==0 && btn8.getText().toString().compareTo("image8")==0
                && btn9.getText().toString().compareTo("image9")==0 && btn10.getText().toString().compareTo("image10")==0
                && btn11.getText().toString().compareTo("image11")==0 && btn12.getText().toString().compareTo("image12")==0
                && btn13.getText().toString().compareTo("image13")==0 && btn14.getText().toString().compareTo("image14")==0
                && btn15.getText().toString().compareTo("image15")==0 && btn16.getText().toString().compareTo("image16")==0)
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
