/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hellotoast;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Displays two Buttons and a TextView.
 * - Pressing the TOAST button shows a Toast.
 * - Pressing the COUNT button increases the displayed mCount.
 *
 * Note: Fixing behavior when device is rotated is a challenge exercise for the student.
 */

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private int mCount = 0;
    //private TextView mShowCount;

    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageTextView = findViewById(R.id.show_count);
    }

    /*
    * Shows a Toast when the TOAST button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since a toast always shows on the top,
    *             the passed in view is not used.
    */
    public void launchActivity2(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, MainActivity2.class);
        String message = mMessageTextView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /*
    * Increments the number in the TextView when the COUNT button is clicked.
    *
    * @param view The view that triggered this onClick handler.
    *             Since the count always appears in the TextView,
    *             the passed in view is not used.
    */
    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mMessageTextView != null)
            mMessageTextView.setText(Integer.toString(mCount));
    }
}
