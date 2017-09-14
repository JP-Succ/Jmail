package com.example.juanpablo.jmail;

/**
 * Created by Juan Pablo on 06/09/2017.
 */

public class Correo {


//ATRIBUTOS

  //  private String[] color_icono = {"#3281FF","#04FF37","#CA37FF","#FFA716","#FFEE26"};
    private String remitente;
    private String asunto;
    private String msj;
    private String email;
    private String color;



    //METODO CONSTRUCTOR
    public Correo(String remitente, String asunto, String msj, String email, String color) {

        this.remitente = remitente;
        this.asunto = asunto;
        this.msj = msj;
        this.email = email;
        this.color = color;
    }

    //METODOS GET Y SET
    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
