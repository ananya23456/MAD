package com.example.validations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText name,password;
    RadioGroup gender;
    CheckBox terms;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       name=findViewById(R.id.Name);
       password=findViewById(R.id.Password);
       gender=findViewById(R.id.gender);
       terms=findViewById(R.id.terms);
       submit=findViewById(R.id.submit);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (name.getText().toString().isEmpty()){
                   name.setError("Enter your name");
                   return;
               }
               if (password.getText().toString().isEmpty()){
                   password.setError("Enter password");
                   return;
               }
               if (password.length()<8){
                   password.setError("password must contain 8 characters");
                   return;
               }
               if (gender.getCheckedRadioButtonId()==-1){
                   Toast.makeText(MainActivity.this, "Select gender", Toast.LENGTH_SHORT).show();
               }
               Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
           }
       });
    }
}