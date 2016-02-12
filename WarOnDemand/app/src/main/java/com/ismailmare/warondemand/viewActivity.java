package com.ismailmare.warondemand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//Currently empty.
public class viewActivity extends AppCompatActivity {

    private String text;

    public String getText() {
        return text;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent = getIntent();
        text = "default text";
        ((TextView)findViewById(R.id.intentText)).setText(text);
    }
}
