package com.ubl.calculator; // Ganti dengan nama package Anda

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.ubl.calculator.R;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber1, txtNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ganti dengan layout Anda

        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
    }

    public void handlePlusButton(View view) {
        String num1Str = txtNumber1.getText().toString().trim();
        String num2Str = txtNumber2.getText().toString().trim();

        if (num1Str.isEmpty()) {
            Toast.makeText(this, "Number 1 is required", Toast.LENGTH_SHORT).show();
            return;
        }

        if (num2Str.isEmpty()) {
            Toast.makeText(this, "Number 2 is required", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int sum = num1 + num2;

        // Tampilkan dialog hasil
        showResultDialog("Result", "The sum is: " + sum);
    }

    public void handleMinusButton(View view) {
        String num1Str = txtNumber1.getText().toString().trim();
        String num2Str = txtNumber2.getText().toString().trim();

        if (num1Str.isEmpty()) {
            Toast.makeText(this, "Number 1 is required", Toast.LENGTH_SHORT).show();
            return;
        }

        if (num2Str.isEmpty()) {
            Toast.makeText(this, "Number 2 is required", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int difference = num1 - num2;

        // Tampilkan dialog hasil
        showResultDialog("Result", "The difference is: " + difference);
    }

    private void showResultDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
