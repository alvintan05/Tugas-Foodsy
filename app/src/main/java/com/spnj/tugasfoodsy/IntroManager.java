package com.example.ranisavira.foodsy_my_own_layout;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rani.savira on 17/12/17.
 */

public class IntroManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context context;

    public IntroManager (Context context)
    {
        this.context=context;
        preferences=context.getSharedPreferences("first",0);
        editor=preferences.edit();
    }

    public void setFirst (boolean inFirst)
    {
        editor.putBoolean("chechk",inFirst);
        editor.commit();
    }

    public static boolean Check()
    {
        return preferences.getBoolean("check",true);
    }
}

