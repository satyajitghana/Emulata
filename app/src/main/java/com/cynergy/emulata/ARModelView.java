package com.cynergy.emulata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cynergy.emulata.armodels.solarsystem.SolarActivity;

public class ARModelView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armodel_view);

        Intent intent = new Intent(ARModelView.this, SolarActivity.class);
        startActivity(intent);
    }
}
