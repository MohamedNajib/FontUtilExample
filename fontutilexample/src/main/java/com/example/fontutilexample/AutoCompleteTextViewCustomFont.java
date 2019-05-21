package com.example.fontutilexample;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.AttributeSet;

public class AutoCompleteTextViewCustomFont extends AppCompatAutoCompleteTextView {


    public AutoCompleteTextViewCustomFont(Context context) {
        super(context);
    }

    public AutoCompleteTextViewCustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyNewCustomTypeface(context, attrs);
    }

    public AutoCompleteTextViewCustomFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyNewCustomTypeface(context, attrs);
    }

    private void applyNewCustomTypeface(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.AutoCompleteTextViewCustomFont);
        String customFont = typedArray.getString(R.styleable.AutoCompleteTextViewCustomFont_font_name);
        applyNewCustomTypeface(context, customFont);
        typedArray.recycle();
    }

    public boolean applyNewCustomTypeface(Context context, String asset) {
        setTypeface(FontUtilCache.getTypefaceFont(context, asset));
        return true;
    }
}
