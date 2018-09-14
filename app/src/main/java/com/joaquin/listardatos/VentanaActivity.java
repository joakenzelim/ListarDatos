package com.joaquin.listardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VentanaActivity extends AppCompatActivity {

    TextView etiNombre,etiTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana);
        etiNombre = (TextView) findViewById( R.id.eti_NombreV );
        etiTelefono = (TextView) findViewById( R.id.eti_telefonoV );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            String datoNombre=(String)extras.get("nombre");//Obtengo el nombre
            String datoTelefono= (String) extras.get("telefono");//Obtengo la edad

            etiNombre.setText(datoNombre);
            etiTelefono.setText(datoTelefono);
        }
    }
}
