package com.example.intent_shared;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView a1,a2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
       a1 = findViewById(R.id.n1);
       a2 = findViewById(R.id.n2);
       String name = getIntent().getStringExtra("name");
       String name1 = getIntent().getStringExtra("name1");
       a1.setText("name:"+name);
       a2.setText("Last name:"+name1);
    }
}