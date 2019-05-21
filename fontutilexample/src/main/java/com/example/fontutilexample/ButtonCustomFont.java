package com.example.fontutilexample;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class ButtonCustomFont extends AppCompatButton {


    public ButtonCustomFont(Context context) {
        super(context);
    }

    public ButtonCustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyNewCustomTypeface(context, attrs);
    }

    public ButtonCustomFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyNewCustomTypeface(context, attrs);
    }

    private void applyNewCustomTypeface(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonCustomFont);
        String customFont = typedArray.getString(R.styleable.ButtonCustomFont_font_name);
        applyNewCustomTypeface(context, customFont);
        typedArray.recycle();
    }

    public boolean applyNewCustomTypeface(Context context, String asset) {
        setTypeface(FontUtilCache.getTypefaceFont(context, asset));
        return true;
    }
}
