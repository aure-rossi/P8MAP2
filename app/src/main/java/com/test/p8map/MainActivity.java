package com.test.p8map;

import static android.content.Intent.FLAG_ACTIVITY_NO_ANIMATION;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    HashMap<Integer, Class> buttonsActivity = new HashMap<>() {{
        put(R.id.button_localisation, LocationPage.class);
        put(R.id.button_guidance, GuidancePage.class);
        put(R.id.button_POI, PoiPage.class);
        put(R.id.button_alternative, AlternativePage.class);
        put(R.id.button_problem, ProblemPage.class);
        put(R.id.button_parameters, ParametersPage.class);
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Class activity = this.buttonsActivity.get(view.getId());
        if (activity != null) {
            Intent intent = new Intent(MainActivity.this, activity);
            startActivity(intent);
            overridePendingTransition(0, 0);
        }
    }
}