package examen1_rodrigovelasquez;

import java.util.ArrayList;

public class Usuario {
    private String nombre, edad, correo, nombre_usuario, contrasena;
    private ArrayList lista_clases = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String edad, String correo, String nombre_usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList getLista_clases() {
        return lista_clases;
    }

    public void setLista_clases(ArrayList lista_clases) {
        this.lista_clases = lista_clases;
    }
    
}
