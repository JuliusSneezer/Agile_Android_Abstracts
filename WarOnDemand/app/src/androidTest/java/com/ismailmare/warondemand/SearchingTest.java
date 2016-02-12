package com.ismailmare.warondemand;

/**
 * Created by Chris on 2/11/2016.
 */

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;
import android.app.Activity;
import android.app.Instrumentation;
import android.test.UiThreadTest;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

public class SearchingTest extends ActivityInstrumentationTestCase2{

    Instrumentation instrumentation;
    Activity activity;
    EditText textInput;

    public SearchingTest() {
        super(SearchingTest.class);
    }

    public void testNoKeyword(){
        Intent intent = new Intent();
        setActivityIntent(intent);
        Searching tester = (Searching) getActivity();
        //textInput = ((EditText) activity.findViewById(R.id.editText));
        ((Button) tester.findViewById(R.id.start_search)).performClick();
    }

    public void testWithKeyword(){
        Intent intent = new Intent();
        setActivityIntent(intent);
        Searching tester = (Searching) getActivity();
        textInput = ((EditText) activity.findViewById(R.id.editText));
        tester.setKeywords(textInput.toString());
        ((Button) tester.findViewById(R.id.start_search)).performClick();
    }

}
