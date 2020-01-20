package com.mikezalik.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guess(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
