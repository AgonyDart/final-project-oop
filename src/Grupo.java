package src;

import java.util.Scanner;

public class Grupo implements Interfaz{
    private String refProfesor;
    private String refSalon;
    private String nombre;

    public Grupo(){}

    public Grupo(String refProfesor, String refSalon, String nombre) {
        this.refProfesor = refProfesor;
        this.refSalon = refSalon;
        this.nombre = nombre;
    }

    public void mostrar() {
      System.out.println(">> Nombre  :"+nombre);
      System.out.println(">> Profesor :"+refProfesor); 
      System.out.println(">> Salon    :"+refSalon);
    }

    public void capturar() {
      Scanner leer = new Scanner(System.in);
      System.out.println(">> Nombre  :");
      nombre = leer.nextLine();
      System.out.println(">> Profesor :");
      refProfesor = leer.nextLine();
      System.out.println(">> Salon    :");
      refSalon = leer.nextLine();
    }

    public String queSoy() {
        return "Grupo";
    }

    public String getRefProfesor() {
        return refProfesor;
    }

    public void setRefProfesor(String refProfesor) {
        this.refProfesor = refProfesor;
    }

    public String getRefSalon() {
        return refSalon;
    }

    public void setRefSalon(String refSalon) {
        this.refSalon = refSalon;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
}
