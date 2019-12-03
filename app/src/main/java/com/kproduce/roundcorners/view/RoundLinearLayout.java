package com.kproduce.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.kproduce.roundcorners.RoundHelper;

public class RoundLinearLayout extends LinearLayout {

    private RoundHelper mHelper = new RoundHelper();

    public RoundLinearLayout(Context context) {
        this(context, null);
    }

    public RoundLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public RoundLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mHelper.init(context, attrs, this);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mHelper.clipPath(canvas, this);
    }
}