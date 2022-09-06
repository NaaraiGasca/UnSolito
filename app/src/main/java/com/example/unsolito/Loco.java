package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Loco extends AppCompatActivity {

    int n;
    Button btnHF;
    TextView txtHF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loco);

        TextView txtTexto;
        txtTexto = findViewById(R.id.textView);
        txtTexto.setText("Dale click :)");

        ImageView img;
        img = findViewById(R.id.imageview);
        final boolean[] invisible = {true};

        Button btnClick;
        btnClick = findViewById(R.id.button);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n++;
                txtTexto.setText("Haz dado click" + " " + n + " " + "veces" );

                if (invisible[0]){
                    img.setVisibility(View.INVISIBLE);
                    invisible[0] = false;
                }
                else
                {
                    img.setVisibility(View.VISIBLE);
                    invisible[0] = true;
                }

            }
        });

        txtHF = (TextView) findViewById(R.id.txtLHora);

        btnHF = findViewById(R.id.btnLHora);
        btnHF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fecha_hora = java.text.DateFormat.getTimeInstance().format(Calendar.getInstance().getTime());
                txtHF.setText(fecha_hora);
            }
        });

    }
}