package com.aperez.heladeria;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        LinearLayout layout = findViewById(R.id.layoutBolas);

        // Obtener datos del intent
        int fresa = getIntent().getIntExtra("fresa", 0);
        int chocolate = getIntent().getIntExtra("chocolate", 0);
        int vainilla = getIntent().getIntExtra("vainilla", 0);

        // Crear bolas de chocolate
        for (int i = 0; i < chocolate; i++) {
            TextView bola = new TextView(this);
            bola.setText("O");
            bola.setTextSize(24);
            bola.setTextColor(getResources().getColor(R.color.chocolate));
            layout.addView(bola);
        }

        // Crear bolas de fresa
        for (int i = 0; i < fresa; i++) {
            TextView bola = new TextView(this);
            bola.setText("O");
            bola.setTextSize(24);
            bola.setTextColor(getResources().getColor(R.color.fresa));
            layout.addView(bola);
        }

        // Crear bolas de vainilla
        for (int i = 0; i < vainilla; i++) {
            TextView bola = new TextView(this);
            bola.setText("O");
            bola.setTextSize(24);
            bola.setTextColor(getResources().getColor(R.color.vainilla));
            layout.addView(bola);
        }


    }
}
