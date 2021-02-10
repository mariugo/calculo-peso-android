package com.mariugo.calculodepeso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pesoTerra;
    RadioGroup rgEscolha;
    Button btnCalcular;
    TextView resultado;
    double peso = 0;
    double calculo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pesoTerra = findViewById(R.id.edPeso);
        rgEscolha = findViewById(R.id.radioGroup);
        btnCalcular = findViewById(R.id.btnCalcular);
        resultado = findViewById(R.id.textViewResultado);

        rgEscolha.setOnCheckedChangeListener((group, checkedId) -> {
            peso = Double.parseDouble(""+pesoTerra.getText().toString());
            if (checkedId == R.id.radioButtonMarte) {
                calculo = peso * 0.38;
            }
            if (checkedId == R.id.rabioButtoJupiter) {
                calculo = peso * 2.64;
            }
            if (checkedId == R.id.radioButtonMercurio) {
               calculo = peso * 0.37;
            }
        });

        btnCalcular.setOnClickListener(v -> resultado.setText(String.format("%s Kg", calculo)));
    }



}