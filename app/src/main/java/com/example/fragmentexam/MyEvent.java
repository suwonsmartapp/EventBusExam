package com.example.fragmentexam;

import android.view.View;

/**
 * Created by junsuk on 2017. 3. 11..
 */

public class MyEvent {
    View view;
    int position;

    public MyEvent(View view, int position) {
        this.view = view;
        this.position = position;
    }
}
