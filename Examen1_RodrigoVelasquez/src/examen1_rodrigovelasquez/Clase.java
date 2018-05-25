package examen1_rodrigovelasquez;

import java.util.ArrayList;

public class Clase {

    private String clase, atributo, metodo;

    public Clase() {
    }

    public Clase(String clase, String atributo, String metodo) {
        this.clase = clase;
        this.atributo = atributo;
        this.metodo = metodo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return getClase() + " class{\n" + "  " + getAtributo() + "\n    " + getMetodo() + "(){\n    }" + "\n}";
    }

}
