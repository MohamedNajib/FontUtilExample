package com.example.fontutilexample;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

public class FontUtilCache {

    // var
    private static HashMap<String, Typeface> mFontCache = new HashMap<>();



    public static Typeface getTypefaceFont(Context context, String font) {

        Typeface myTypeface = mFontCache.get(font);
        if (myTypeface == null) {
            try {
                myTypeface = Typeface.createFromAsset(context.getAssets(), font);
            } catch (Exception e) {
                return null;
            }
            mFontCache.put(font, myTypeface);
        }
        return myTypeface;
    }
}
