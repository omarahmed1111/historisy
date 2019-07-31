package com.example.historicy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void msg(String s)
    {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
    }
    public void next(View view){
        EditText user = (EditText) findViewById(R.id.text1);
        EditText pass = (EditText) findViewById(R.id.textView3);
        if(user.getText().toString()==""){
            msg("username field is empty");
        }
        else if(pass.getText().toString()==""){
            msg("password field is empty");
        }
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
