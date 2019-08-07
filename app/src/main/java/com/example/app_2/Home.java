package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView = findViewById(R.id.tv2);
        Bundle b = getIntent().getExtras();
        if(!b.getString("key").equals("123")){
            finish();
        }
        textView.setText(b.getString("name"));
    }

    public void onBack(View view) {
        finish();
    }
}
