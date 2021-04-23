package com.cput.letsohadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Launcher extends AppCompatActivity {


    TextView studName, visitor_name;
    Button next_to_menu;
    EditText editTextTextVisitorName;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        next_to_menu = (Button) findViewById(R.id.next_to_menu);
        editTextTextVisitorName = (EditText)findViewById(R.id.editTextTextVisitorName);


        next_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataMenu();
            }
        });
    }

    public void sendDataMenu()
    {
        name = editTextTextVisitorName.getText().toString().trim();

        Intent intent = new Intent(Launcher.this, Menu.class);

        intent.putExtra(Menu.NAME, name);
        startActivity(intent);
    }

}