import java.util.Scanner;
import java.io.*;

public class Calificacion implements java.io.Serializable {
    private String idEstudiante;
    private String idGrupo;
    private String idMateria;
    private String bimestre;
    private int calificacion;

    public Calificacion(){}

    public Calificacion(String idEstudiante, String idGrupo, String idMateria, String bimestre, int calificacion) {
        this.idEstudiante = idEstudiante;
        this.idGrupo = idGrupo;
        this.idMateria = idMateria;
        this.bimestre = bimestre;
        this.calificacion = calificacion;
    }

    public void mostrar() {
        System.out.println("\n << << Mostrar Calificacion >> >>");
        System.out.println(">> Estudiante        :" + idEstudiante);
        System.out.println(">> Grupo             :" + idGrupo);
        System.out.println(">> Materia           :" + idMateria);
        System.out.println(">> Bimestre          :" + bimestre);
        System.out.println(">> Calificacion      :" + calificacion);
    }

    public void capturar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Calificaciones << << )");
        System.out.print("<< Estudiante       :");
        idEstudiante = leer.nextLine();
        System.out.print("<< Grupo            :");
        idGrupo = leer.nextLine();
        System.out.print("<< Materia          :");
        idMateria = leer.nextLine();
        System.out.print("<< Bimestre         :");
        bimestre = leer.nextLine();
        System.out.print("<< Calificacion     :");
        calificacion = leer.nextInt();
    }

    public void capturarAuto(String idEstudianteR, String idGrupoR, String idMateriaR) {
        Scanner leer = new Scanner(System.in);
        idEstudiante = idEstudianteR;
        idGrupo = idGrupoR;
        idMateria = idMateriaR;
        System.out.print("<< Bimestre         :");
        bimestre = leer.nextLine();
        System.out.print("<< Calificacion     :");
        calificacion = leer.nextInt();
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}