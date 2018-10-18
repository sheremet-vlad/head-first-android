package com.example.vlad.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_messege);
    }

    public void onClickSend(View view) {
        Intent intent = new Intent(this, RecieveActivity.class);

        EditText editMessage = (EditText) findViewById(R.id.message);
        String message = String.valueOf(editMessage.getText());

        intent.putExtra("message",message);

        startActivity(intent);

    }
}
