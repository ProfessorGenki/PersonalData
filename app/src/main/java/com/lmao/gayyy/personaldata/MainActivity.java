package com.lmao.gayyy.personaldata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String FAGGOT_MESSAGE = "Gay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState !=null) {

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        //Intent intent = getIntent();
        String messageText3 = intent.getStringExtra(FAGGOT_MESSAGE);
        TextView messageView3 = (TextView) findViewById(R.id.Gay);
        messageView3.setText("On the ShowActivity i asked if you were gay and you said: " + messageText3);
    }

    //call ClickedSend when you click the send button
    public void ClickedSend(View view) {

        EditText NameView = (EditText) findViewById(R.id.Name);
        String NameText = NameView.getText().toString();

        EditText AddressView = (EditText) findViewById(R.id.Address);
        String AddressText = AddressView.getText().toString();

        Intent intent = new Intent(this, ShowActivity.class);

        intent.putExtra(ShowActivity.EXTRA_MESSAGE, NameText);

        intent.putExtra(ShowActivity.ANOTHER_MESSAGE, AddressText);
        startActivityForResult(intent, 1);
    }
}
