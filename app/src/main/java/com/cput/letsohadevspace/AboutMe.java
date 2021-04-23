package com.cput.letsohadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity {

    TextView textView;
    Button buttonMenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        buttonMenu1 = (Button)findViewById(R.id.buttonMenu);

        buttonMenu1.setOnClickListener((v -> startActivity(new Intent(AboutMe.this, Menu.class))));

        textView = findViewById(R.id.textViewAboutMe);
        textView.setText (
                " Yolo, Lebusa Letsoha here... "+
                " I'm in my final year at CPUT in ICT: doing software Engineering."+
                " I'm an aspiring software developer. "+
                " I work as technical support at Logicals SA. "+
                " I enjoy coding, it teaches you how to think. "+
                " I'd like to create my own apps for commercial use. "+
                " And post them on App store. "+
                " I am looking for hands on experience "+
                " I am a fast learner and thrive under challenge" +
                " I want to start my own software company in five years.");
    }
}