package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText contrasenya;
    EditText nomUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contrasenya= findViewById(R.id.editTextTextPassword);
        nomUsuario= findViewById(R.id.editTextTextEmailAddress);
        Button buttonEntrar= findViewById(R.id.buttonEntrar);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginUsuario();
            }
        });


    }

    /*
    protected void onStart()
    {
        super.onStart();
        Log.i("prueba", "estoy en ceac");
    }*/

    protected void loginUsuario()
    {
        String usuarioSaved = nomUsuario.getText().toString();
        String contrasenyaSaved= contrasenya.getText().toString();
        if (contrasenyaSaved.equals("JmesiasCR7"))
        {
            Intent primerPaso= new Intent(MainActivity.this, Bienvenido.class);
            primerPaso.putExtra("Bienvenido ", usuarioSaved);
            startActivity(primerPaso);
            finish();
        }else
        {
            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

}
