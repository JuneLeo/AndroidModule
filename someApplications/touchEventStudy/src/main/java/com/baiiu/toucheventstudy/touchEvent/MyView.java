package com.baiiu.toucheventstudy.touchEvent;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.baiiu.library.LogUtil;

/**
 * author: baiiu
 * date: on 17/5/8 14:13
 * description:
 */
public class MyView extends android.support.v7.widget.AppCompatTextView {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        LogUtil.d("View --> dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
        //return true;
    }

    @Override public boolean onTouchEvent(MotionEvent event) {
        LogUtil.d("View --> onTouchEvent");
        return super.onTouchEvent(event);
    }
}
