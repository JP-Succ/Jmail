package com.example.juanpablo.jmail;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MailActivity extends AppCompatActivity {


    TextView remitente;
    TextView asunto;
    TextView msj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);



        Bundle extras = getIntent().getExtras();

        remitente = (TextView) findViewById(R.id.tvRemitente);
        asunto = (TextView) findViewById(R.id.tvAsunto);
        msj = (TextView) findViewById(R.id.tvMensaje);

        remitente.setText(extras.getString("KEY_REMITENTE"));
        asunto.setText(extras.getString("KEY_ASUNTO"));
        msj.setText(extras.getString("KEY_MSJ"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_detalle_mail, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){


            case R.id.mnuAtras:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
