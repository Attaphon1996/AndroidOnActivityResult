package com.example.navadroid.androidonactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    private TextView text;
    private static final int RESULT_OK = 0;
    private String val1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        text = (TextView) findViewById(R.id.textView);
        val1 = getIntent().getStringExtra("Text");
        text.setText(val1);
    }

    @Override
    public void finish() {
        Intent intent = new Intent();

        if (((RadioButton) findViewById(R.id.rb_apple)).isChecked()) {
            intent.putExtra("returnKey1", "This is an apple.");
        }
        if (((RadioButton) findViewById(R.id.rb_pen)).isChecked()) {
            intent.putExtra("returnKey2", "This is a pen.");
        }
        setResult(RESULT_OK, intent); //
        super.finish();
    }
}
