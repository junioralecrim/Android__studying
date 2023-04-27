package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inputTextPeso;
    private EditText inputTextAltura;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTextAltura = findViewById(R.id.inputTextAltura);
        inputTextPeso = findViewById(R.id.inputTextPeso);
        result = findViewById(R.id.textViewResult);

    }
    public void clickButton(View view){
        /*
        Capturando entradas de altura e peso e convertendo para Integer
        * */
        Double altura = Double.parseDouble(inputTextAltura.getText().toString());
        Double peso = Double.parseDouble(inputTextPeso.getText().toString());
        Double resultado = peso/(altura*altura);

        result.setText(String.format("%.2f", resultado));
        String test = String.format("%.2f", resultado);

        Toast.makeText(MainActivity.this, test, Toast.LENGTH_SHORT).show();
    }
}