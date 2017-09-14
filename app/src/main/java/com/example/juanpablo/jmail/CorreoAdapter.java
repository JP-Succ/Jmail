package com.example.juanpablo.jmail;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Pablo on 06/09/2017.
 */

public class CorreoAdapter extends BaseAdapter {


    private ArrayList<Correo> correos;
    private final int MAX_LARGO_MENSAJE = 40;

    //CONSTRUCTOR
    public CorreoAdapter(ArrayList<Correo> correos) {
        this.correos = correos;
    }

    //METODOS CLASE BASE ADAPTER
    @Override
    public int getCount() {
        return correos.size();
    }

    @Override
    public Object getItem(int position) {
        return correos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if (convertView == null){

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_row,parent, false);

        }else{
            view = convertView;
        }

        Correo correo = (Correo) getItem(position);

        TextView remitente = (TextView) view.findViewById(R.id.tvRemitente);
        TextView asunto = (TextView) view.findViewById(R.id.tvAsunto);
        TextView mensaje = (TextView) view.findViewById(R.id.tvMensaje);
        TextView inicial_contacto = (TextView) view.findViewById(R.id.tvColor);
       // TextView color = (TextView) view.findViewById(R.id.tvColor);

        remitente.setText(correos.get(position).getRemitente().toString());
        asunto.setText(correos.get(position).getAsunto().toString());
        // mensaje.setText(correos.get(position).getMsj().toString());
        inicial_contacto.setText(correos.get(position).getRemitente().toString().substring(0,1));
        inicial_contacto.getBackground().setColorFilter(Color.parseColor(correo.getColor()), PorterDuff.Mode.SRC);

        if (correo.getMsj().length() > MAX_LARGO_MENSAJE) {
            mensaje.setText(correo.getMsj().substring(0, MAX_LARGO_MENSAJE));
        }
        else{
            mensaje.setText(correos.get(position).getMsj().toString());
        }

        return view;
    }



}
