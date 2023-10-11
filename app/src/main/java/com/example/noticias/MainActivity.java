package com.example.noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkEconomia, checkEsporte, checkLazer;

    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkEconomia = findViewById(R.id.checkEconomia);
        checkEsporte = findViewById(R.id.checkEsporte);
        checkLazer = findViewById(R.id.checkLazer);

        textResultado = findViewById(R.id.textResultado);
    }

    public void checkbox() {
        String texto = "";

        if (checkEconomia.isChecked()) {
            texto = "Economia selecionado\n";
        } if (checkEsporte.isChecked()) {
            texto = texto + "Esporte selecionado\n";
        } if (checkLazer.isChecked()) {
            texto = texto + "Lazer selecionado\n";
        }

        textResultado.setText(texto);
    }

    public void enviar(View view) {
        checkbox();
    }
}