package com.example.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickShowToasts(View view) {
        CharSequence message = "Hello, i am toasts";

        int time = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(this, message, time);

        toast.show();
    }
}
