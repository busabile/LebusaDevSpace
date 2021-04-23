package com.cput.letsohadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculation extends AppCompatActivity {
    Button button_to_menu_screen1;
    Button buttonGerateResults1;

    TextView textViewResultDisplay1;

    EditText editTextTextLength1;
    EditText editTextTextHeight1;
    EditText editTextTextWidth1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        editTextTextWidth1 = (EditText)findViewById(R.id.editTextTextWidth);
        editTextTextHeight1 = (EditText)findViewById(R.id.editTextTextHeight);
        editTextTextLength1 = (EditText)findViewById(R.id.editTextTextLength);

       // textViewResultDisplay1 = (TextView)findViewById(R.id.textViewResultDisplay);
        buttonGerateResults1 = (Button) findViewById(R.id.buttonGerateResults);

        // Back to Menu
        button_to_menu_screen1 = (Button)findViewById(R.id.button_to_menu_screen);
        button_to_menu_screen1.setOnClickListener((v -> startActivity(new Intent(Calculation.this, Menu.class))));
        /*
        For a rectangular tank with the length l = 4 cm, width w = 5 cm and height h = 7 cm, we can calculate its surface area like so:
        A = 2lw + 2lh + 2wh.
        A = 2 * 4 * 5 + 2 * 4 * 7 + 2 * 5 * 7 = 166 cm.

         */
        buttonGerateResults1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTextLength1.getText().toString().equals(""))
                {
                    Toast.makeText(Calculation.this, "Please Enter length", Toast.LENGTH_SHORT).show();
                }
                else if(editTextTextWidth1.getText().toString().equals(""))
                {
                    Toast.makeText(Calculation.this, "Please Enter width", Toast.LENGTH_SHORT).show();
                }
                else if(editTextTextHeight1.getText().equals(""))
                {
                    Toast.makeText(Calculation.this, "Please Enter Height", Toast.LENGTH_SHORT);
                }
                else {
                    int editTextTextLength = Integer.valueOf(editTextTextLength1.getText().toString());
                    int editTextTextWidth = Integer.valueOf(editTextTextWidth1.getText().toString());
                    int editTextTextHeight = Integer.valueOf(editTextTextHeight1.getText().toString());

                    /*
                    For a rectangular tank with the length
                     l = 4 cm, width w = 5 cm and height h = 7 cm, we can calculate its surface area like so:
                     A = 2lw + 2lh + 2wh. A = 2 * 4 * 5 + 2 * 4 * 7 + 2 * 5 * 7 = 166 cm.

                     */
                    int firstfinal = 2 * editTextTextLength * editTextTextWidth;
                    int secondfinal = 2 * editTextTextLength * editTextTextHeight;
                    int thirdfinal = 2 * editTextTextWidth * editTextTextLength;

                    int sum = firstfinal + secondfinal + thirdfinal;

                    buttonGerateResults1.setText("Result: " + sum);
                }}

        });

    }}