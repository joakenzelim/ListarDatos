package com.joaquin.listardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnEnviar;
    private EditText ediNombre,ediTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        ediNombre = (EditText) findViewById( R.id.edi_Nombre );
        ediTelefono = (EditText) findViewById( R.id.edi_Telefono );

        btnEnviar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;//Declaro el Intent

        //Instanciamos el Intent dandole:
        // el contexto y la clase a la cual nos deseamos dirigir
        explicit_intent = new Intent(this,VentanaActivity.class);
        String auxEdiNombre=ediNombre.getText().toString();
        String auxEdiTelefono=ediTelefono.getText().toString();

        explicit_intent.putExtra("nombre",auxEdiNombre);//Guardamos una cadena
        explicit_intent.putExtra("telefono",auxEdiTelefono);//Guardamos un entero

        //lo iniciamos pasandole la intencion, con todos sus parametros guardados
        startActivity(explicit_intent);
    }
}
