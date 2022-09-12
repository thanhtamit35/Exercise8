package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView twResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mapping();

        ArrayList<String> data = getIntent().getStringArrayListExtra("data");
        StringBuilder res = new StringBuilder();

        for (String element : data) {
            res.append(element).append("\n");
        }

        twResult.setText(res.toString());
    }

    private void mapping() {
        twResult = findViewById(R.id.tw_result);
    }
}
