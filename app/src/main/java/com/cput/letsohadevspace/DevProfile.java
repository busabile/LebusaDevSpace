package com.cput.letsohadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DevProfile extends AppCompatActivity {

    Button buttonMenuScr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_profile);

        buttonMenuScr1 = (Button)findViewById(R.id.buttonMenuScr);
        //        buttonHome1.setOnClickListener((v -> startActivity( new Intent(Menu.this, Launcher.class))));

        buttonMenuScr1.setOnClickListener((v -> startActivity(new Intent(DevProfile.this, Menu.class ))));
    }
}