package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Instanciamos los botones que usaremos de forma global
    Button btnAcceder, btnSalir;
    //Instanciamos los edit text para validar usuario y contraseña
    EditText txtUsuario, txtContrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mensaje de bienvenida al entrar
        Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_LONG).show();

        txtUsuario = findViewById(R.id.txtMUsuario);
        txtContrasenia = findViewById(R.id.txtMContra);

        btnAcceder = findViewById(R.id.btnMAcceder);
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = txtUsuario.getText().toString();
                String contra = txtContrasenia.getText().toString();
                if (user.equals("Naarai") && contra.equals("12345")){
                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSalir = findViewById(R.id.btnMSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Saliendo de la aplicación", Toast.LENGTH_LONG);
                finishAffinity();
            }
        });

    }
}