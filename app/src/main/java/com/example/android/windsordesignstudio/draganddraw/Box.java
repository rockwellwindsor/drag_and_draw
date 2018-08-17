package com.example.android.windsordesignstudio.draganddraw;

import android.graphics.PointF;

/**
 * Created by Rockwell Windsor Rice on 8/1/18.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = origin;  // Where the finger was first placed
        mCurrent = origin; // Where the finger currently is
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
