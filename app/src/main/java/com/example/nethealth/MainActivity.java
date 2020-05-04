package com.example.nethealth;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnlogin;
    TextView respuestalogin;
    EditText usuariot,passwordt;
    ProgressBar progressBar;
    Spinner spinner;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnlogin = findViewById(R.id.btnlogin);
        respuestalogin = findViewById(R.id.respuestalogin);
        usuariot = findViewById(R.id.usuariot);
        passwordt = findViewById(R.id.passwordt);
        spinner = (Spinner) findViewById(R.id.spinner);
        // se escuchan todos los botones
        btnlogin.setOnClickListener((View.OnClickListener) this);

        //se elimina la barra superior
        getSupportActionBar().hide();

        //circulo de carga
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        progressBar.setVisibility(View.GONE);

        String[] temp_arr = new String[5];
        temp_arr[0] = "Empresa";
        temp_arr[1] = "NetLogistik";
        temp_arr[2] = "a";
        temp_arr[3] = "b";
        temp_arr[4] = "c";


        ArrayAdapter<String> adapterempresas = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,temp_arr);

        adapterempresas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapterempresas);

        spinner.setAdapter(adapterempresas);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id){
            case R.id.btnlogin:
                goTologin();
                break;


        }

    }

    private void goTologin() {

        String usuario = usuariot.getText().toString();
        String password = passwordt.getText().toString();

        Intent opcionesitent =  new Intent(MainActivity.this,Principal.class);
        opcionesitent.putExtra("usuariot", usuario);
        opcionesitent.putExtra("passwordt", password);
        startActivity(opcionesitent);

    }

}
