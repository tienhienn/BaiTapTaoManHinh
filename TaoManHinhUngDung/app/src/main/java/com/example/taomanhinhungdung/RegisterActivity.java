package com.example.taomanhinhungdung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText etFullName, etRegEmail, etRegPassword, etRegPasswordConfirm;
    Button btnSubmitRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Ánh xạ view từ layout
        etFullName = findViewById(R.id.etFullName);
        etRegEmail = findViewById(R.id.etRegEmail);
        etRegPassword = findViewById(R.id.etRegPassword);
        etRegPasswordConfirm = findViewById(R.id.etRegPasswordConfirm);
        btnSubmitRegister = findViewById(R.id.btnSubmitRegister);
    }
}
