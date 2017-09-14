package com.example.juanpablo.jmail;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Correo> correos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        this.cargarLista(correos);

        ListView listview = (ListView) findViewById(R.id.listview);


        listview.setAdapter(new CorreoAdapter(correos));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Correo correoSeleccionado = correos.get(position);

                Intent intent = new Intent(MainActivity.this, MailActivity.class);

                intent.putExtra("KEY_REMITENTE", correoSeleccionado.getRemitente());
                intent.putExtra("KEY_ASUNTO", correoSeleccionado.getAsunto());
                intent.putExtra("KEY_MSJ", correoSeleccionado.getMsj());

                startActivity(intent);
            }


        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        final SwipeRefreshLayout sfLista = (SwipeRefreshLayout) findViewById(R.id.sflLista);

        switch (item.getItemId()){


            case R.id.mnuBuscar :
                sfLista.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){

                    @Override
                    public void onRefresh() {
                        cargarLista(correos);
                        sfLista.setRefreshing(false);
                    }
                });
                return true;

            case R.id.mnuCerrar:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void cargarLista(ArrayList<Correo> correos){

        correos.add(new Correo(
                "Juan Pablo",
                "Este es el asunto",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#3647FF"
        ));

        correos.add(new Correo(
                "Turismo City",
                "Ofertas recomendadas de la semana",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#00695c"
        ));

        correos.add(new Correo(
                "Mercado Libre",
                "¿juan pablo, buscas algo en particular?",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#3f51b5"
        ));

        correos.add(new Correo(
                "Campus MVP",
                "Curso de ASP NET CORE 2 MVC",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#31FF35"
        ));

        correos.add(new Correo(
                "Turismo City",
                "Ofertas recomendadas de la semana",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#FFEE0B"
        ));

        correos.add(new Correo(
                "Mercado Libre",
                "¿juan pablo, buscas algo en particular?",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#FF9811"
        ));

        correos.add(new Correo(
                "Campus MVP",
                "Curso de ASP NET CORE 2 MVC",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#F520FF"
        ));

        correos.add(new Correo(
                "Turismo City",
                "Ofertas recomendadas de la semana",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#2A1EFF"
        ));

        correos.add(new Correo(
                "Mercado Libre",
                "¿juan pablo, buscas algo en particular?",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#3f51b5"
        ));

        correos.add(new Correo(
                "Campus MVP",
                "Curso de ASP NET CORE 2 MVC",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#00695c"
        ));

        correos.add(new Correo(
                "Turismo City",
                "Ofertas recomendadas de la semana",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#00695c"
        ));

        correos.add(new Correo(
                "Mercado Libre",
                "¿juan pablo, buscas algo en particular?",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#3f51b5"
        ));

        correos.add(new Correo(
                "Campus MVP",
                "Curso de ASP NET CORE 2 MVC",
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consequuntur repudiandae maiores, illum doloremque inventore officiis magni fugit, optio et magnam ipsa enim veniam harum vel ab maxime minima voluptatibus cupiditate",
                "jpsuccurro1.jps@gmail.com",
                "#00695c"
        ));


    }
}
