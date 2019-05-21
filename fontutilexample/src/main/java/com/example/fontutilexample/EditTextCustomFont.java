package com.example.fontutilexample;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class EditTextCustomFont extends AppCompatEditText {


    public EditTextCustomFont(Context context) {
        super(context);
    }

    public EditTextCustomFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyNewCustomTypeface(context, attrs);
    }

    public EditTextCustomFont(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyNewCustomTypeface(context, attrs);
    }

    private void applyNewCustomTypeface(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextCustomFont);
        String customFont = typedArray.getString(R.styleable.EditTextCustomFont_font_name);
        applyNewCustomTypeface(context, customFont);
        typedArray.recycle();
    }

    public boolean applyNewCustomTypeface(Context context, String asset) {
        setTypeface(FontUtilCache.getTypefaceFont(context, asset));
        return true;
    }
}
