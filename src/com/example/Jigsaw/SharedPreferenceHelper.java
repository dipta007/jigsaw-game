package com.example.Jigsaw;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Shubhashis on 1/20/2015 at 2:43 AM.
 */
public class SharedPreferenceHelper extends Activity{
    private SharedPreferences preferenceSettings;
    private SharedPreferences.Editor preferenceEditor;

    private int number;

    public SharedPreferenceHelper(int number) {
        this.number = number;
        saveTheData();
    }

    private void saveTheData() {
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

        /*String tagName[] = new String[3];
        tagName[0] = "number1";
        tagName[1] = "number2";
        tagName[3] = "number3";

        for(int i=0;i<3;i++)
        {
            Log.w("app",arr.get(i).toString());
            preferenceEditor.putInt(tagName[i],arr.get(i));
        }
        preferenceEditor.apply();*/
    }
}
