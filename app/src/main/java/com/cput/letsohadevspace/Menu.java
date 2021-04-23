package com.cput.letsohadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    public static final String NAME = "NAME";
    private TextView displayVisitorName;
    private String name;

    Button buttonHome1;
    Button buttonCalculation1;
    Button buttonAbtMe1;
    Button button_dev_profile1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        displayVisitorName = findViewById(R.id.displayVisitorName);

        // Button to main screen
        buttonHome1 = (Button)findViewById(R.id.buttonHome) ;
        buttonHome1.setOnClickListener((v -> startActivity( new Intent(Menu.this, Launcher.class))));

        // Button to Calculation screen
        buttonCalculation1 = (Button)findViewById(R.id.buttonCalculation);
        buttonCalculation1.setOnClickListener((v -> startActivity(new Intent(Menu.this, Calculation.class))));

        // Button to About me screen
        buttonAbtMe1 = (Button)findViewById(R.id.buttonAbtMe);
        buttonAbtMe1.setOnClickListener((v -> startActivity(new Intent(Menu.this, AboutMe.class))));

        // Button to My dev profile screen
        button_dev_profile1 = (Button)findViewById(R.id.button_dev_profile);
        button_dev_profile1.setOnClickListener((v -> startActivity(new Intent(Menu.this, DevProfile.class))));

        Intent intent = getIntent();
        name = intent.getStringExtra(NAME);

        displayVisitorName.setText("Dear " + name);

    }

}