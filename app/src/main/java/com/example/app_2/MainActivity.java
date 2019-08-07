package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
    }
    String username = "admin";
    String password = "1111";
    int age = 30;
    public void onLogin(View view){
        if(username.equals(ed1.getText().toString()) && password.equals(ed2.getText().toString())){
            Toast.makeText(this,"Login",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,Home.class);
            intent.putExtra("name",username);
            intent.putExtra("age", age);
            intent.putExtra("key", "123");
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Invalid Username or Password",Toast.LENGTH_LONG).show();
        }
    }
}
