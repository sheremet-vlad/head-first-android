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

        EditText editMessage = (EditText) findViewById(R.id.message);
        String message = String.valueOf(editMessage.getText());

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);

        String chooserTitle = getString(R.string.chooser);
        Intent chooserIntent = Intent.createChooser(intent, chooserTitle);

        startActivity(chooserIntent);

    }
}
