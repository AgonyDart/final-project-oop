import java.util.*;
import java.io.*;

public class Periodo implements Interfaz, java.io.Serializable {
    private String inicio;
    private String fin;
    private String nombre;
    private int idPeriodo;

    Periodo(){}

    Periodo(String inicio, String fin, String nombre, int idPeriodo) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
        this.idPeriodo = idPeriodo;
    }

    public void mostrar() {
        System.out.println("\n << << Mostrar Periodo >> >>");
        System.out.println(">> Inicio      :" + nombre);
        System.out.println(">> Fin         :" + fin);
        System.out.println(">> Nombre      :" + nombre);
        System.out.println(">> ID          :" + idPeriodo);
    }

    public void capturar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Periodo << << )");
        System.out.print("<< Inicio       :");
        nombre = leer.nextLine();
        System.out.print("<< Fin          :");
        fin = leer.nextLine();
        System.out.print("<< Nombre       :");
        nombre = leer.nextLine();
        idPeriodo = genId();
    }

    private int genId(){
        String id = "";
        String number;
        for (int i = 0; i < 4; i++){
            number = String.valueOf((int) (Math.random() * 10 + 1));
            id += number;
        }
        return Integer.parseInt(id);
    }

    public String queSoy() {
        return "Periodo";
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
}