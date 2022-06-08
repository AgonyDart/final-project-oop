import java.util.Scanner;
import java.io.*;

public class Grupo implements Interfaz, java.io.Serializable {
    private int idPeriodo;
    private String refSalon;
    private String nombre;
    private String idGrupo;
    private String refProfesor;

    public Grupo(){}

    public Grupo(int idPeriodo, String refSalon, String nombre, String idGrupo,String refProfesor) {
        this.idPeriodo = idPeriodo;
        this.refSalon = refSalon;
        this.nombre = nombre;
        this.idGrupo = idGrupo;
        this.refProfesor = refProfesor;
    }

    public void mostrar() {
      System.out.println(">> Periodo    :"+idPeriodo);
      System.out.println(">> Salon      :"+refSalon);
      System.out.println(">> Nombre     :"+nombre);
      System.out.println(">> ID         :"+idGrupo);
      System.out.println(">> Profesor   :"+refProfesor);
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

    public int getIdPeriodo(){
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo){
        this.idPeriodo = idPeriodo;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}