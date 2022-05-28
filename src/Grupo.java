package src;

import java.util.Scanner;

public class Grupo implements Interfaz {
    private String refEstudiantes[] = new refEstudiantes[100];
    private String refProfesor;
    private String refSalon;
    private String horario;

    public Grupo(){}

    public Grupo(String[] refEstudiantes, String refProfesor, String refSalon, String horario) {
        this.refEstudiantes = refEstudiantes;
        this.refProfesor = refProfesor;
        this.refSalon = refSalon;
        this.horario = horario;
    }

    public void mostrar() {
      System.out.println(">> Profesor :"+profesor); 
      System.out.println(">> Salon    :"+salon);
      System.out.println(">> Horario  :"+horario);
    }

    public void capturar() {
      Scanner leer = new Scanner(System.in);
      System.out.println(">> Profesor :"); //agregar un metodo para hacerlo automatico como estudiantes por fa xd
      refProfesor = leer.nextLine();
      System.out.println(">> Salon    :");
      refSalon = leer.nextLine()
      System.out.println(">> Horario  :");
      horario = leer.nextLine()
    }
  public void capturarRefEstudiantes(String string) {//pensado para guardar automatico los estudiantes que tengan el atributo que los linkea al grupo pa guardarlos al arrray
  
  }
  public void mostrarEstudiantes(String string) {//segun yo si jala pero no lo probe
    String textForSearching;
    for (int i = 0; i < cPersonas; i++) {
      if (personas[i] != null && personas[i].whatI().equals("Estudiante")) {
        Estudiante e = (Estudiante) personas[i];
        textForSearching = e.getGrupo();
        if (textForSearching.contains(string)) {
            System.out.println(e.getNoControl+e.getGrupo);
        }
        textForSearching = "";
      }
    }
  }

    public String queSoy() {
        return "Grupo";
    }

    public String[] getRefEstudiantes() {
        return refEstudiantes;
    }

    public void setRefEstudiantes(String[] refEstudiantes) {
        this.refEstudiantes = refEstudiantes;
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

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}
