package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    Button btnCalculadora, btnImagenes, btnWeb,btnVideo,
            btnGps, btnLoco, btnAcercade, btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        //Boton de Calculadora
        btnCalculadora = findViewById(R.id.btnMPCalculadora);
        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Calculadora.class);
                startActivity(intent);
            }
        });

        //Boton de Imagenes
        btnImagenes = findViewById(R.id.btnMPImagenes);
        btnImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Imagenes.class);
                startActivity(intent);
            }
        });

        //Boton de Web
        btnWeb = findViewById(R.id.btnMPWeb);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Web.class);
                startActivity(intent);
            }
        });

        //Boton de Video
        btnVideo = findViewById(R.id.btnMPVideo);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Video.class);
                startActivity(intent);
            }
        });

        //Boton de GPS
        btnGps = findViewById(R.id.btnMPGps);
        btnGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), GPS.class);
                startActivity(intent);
            }
        });

        //Boton de Loco
        btnLoco = findViewById(R.id.btnMPLoco);
        btnLoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(view.getContext(), Loco.class);
                startActivity(intent);
            }
        });

        //Boton de Acerca de
        btnAcercade = findViewById(R.id.btnMPAcercade);
        btnAcercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCreditos();
            }
        });

        //Boton de Regresar
        btnRegresar = findViewById(R.id.btnMPRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuPrincipal.this, "Regresando...", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }

    public void getCreditos(){
        new AlertDialog.Builder(this)
                .setTitle("ACERCA DE..")
                .setMessage("" +
                        "Salma Naarai Gasca Mendoza \n" +
                        "Profesora: Rocio Elizabeth Pulido Alba \n" +
                        "Movil 2022-B \n" +
                        "vrs 001").setPositiveButton("Aceptar", null).show();
    }

}