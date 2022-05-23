package src;

public class Grupo implements Interfaz {
    private String refEstudiantes[];
    private String refProfesor;
    private String refSalon;
    private String Horario;

    public Grupo(){}

    public Grupo(String[] refEstudiantes, String refProfesor, String refSalon, String Horario) {
        this.refEstudiantes = refEstudiantes;
        this.refProfesor = refProfesor;
        this.refSalon = refSalon;
        this.Horario = Horario;
    }

    public void mostrar() {
        
    }

    public void capturar() {
        
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