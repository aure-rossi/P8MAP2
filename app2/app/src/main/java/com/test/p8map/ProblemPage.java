package com.test.p8map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProblemPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_page);
    }
    public void goBack(View view) {
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}