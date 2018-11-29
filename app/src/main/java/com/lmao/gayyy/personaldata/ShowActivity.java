package com.lmao.gayyy.personaldata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Name";
    public static final String ANOTHER_MESSAGE = "Address";
    public static final String FAGGOT_MESSAGE = "Gay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.Name);
        messageView.setText("Name: " + messageText);

        String messageText2 = intent.getStringExtra(ANOTHER_MESSAGE);
        TextView messageView2 = (TextView)findViewById(R.id.Address);
        messageView2.setText("Address: " + messageText2);
    }

    public void ClickedBack(View view) {

        EditText GayView = (EditText) findViewById(R.id.Gay);
        String GayText = GayView.getText().toString();

        Intent intent = new Intent();

        intent.putExtra(MainActivity.FAGGOT_MESSAGE, GayText);

        setResult(RESULT_OK, intent);
        finish();
    }
}