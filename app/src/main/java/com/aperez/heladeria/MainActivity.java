package com.aperez.heladeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editFresa, editChocolate, editVainilla;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFresa = findViewById(R.id.editFresa);
        editChocolate = findViewById(R.id.editChocolate);
        editVainilla = findViewById(R.id.editVainilla);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener cantidades
                int fresa = Integer.parseInt(editFresa.getText().toString());
                int chocolate = Integer.parseInt(editChocolate.getText().toString());
                int vainilla = Integer.parseInt(editVainilla.getText().toString());

                // Crear intent para enviar datos
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fresa", fresa);
                intent.putExtra("chocolate", chocolate);
                intent.putExtra("vainilla", vainilla);

                startActivity(intent);
            }
        });
    }
}
