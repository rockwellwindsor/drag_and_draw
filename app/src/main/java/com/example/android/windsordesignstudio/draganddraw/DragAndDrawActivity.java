package com.example.android.windsordesignstudio.draganddraw;

import android.support.v4.app.Fragment;

import com.example.android.windsordesignstudio.draganddraw.fragments.DragAndDrawFragment;

public class DragAndDrawActivity extends com.example.android.windsordesignstudio.draganddraw.SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
