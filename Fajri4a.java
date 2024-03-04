package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Fajri4a extends AppCompatActivity {
    EditText editTextPanjang, editTextLebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPanjang = findViewById(R.id.Panjang);
        editTextLebar = findViewById(R.id.Lebar);

        Button buttonHitung = findViewById(R.id.button);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungDanTampilkan();
            }
        });
    }

    private void hitungDanTampilkan() {
        double panjang = Double.parseDouble(editTextPanjang.getText().toString());
        double lebar = Double.parseDouble(editTextLebar.getText().toString());

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        Intent intent = new Intent(this, Fajri4a2.class);
        intent.putExtra("panjang", panjang);
        intent.putExtra("lebar", lebar);
        intent.putExtra("luas", luas);
        intent.putExtra("keliling", keliling);
        startActivity(intent);
    }
}