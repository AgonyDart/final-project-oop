import java.util.Scanner;

public abstract class Persona implements Interfaz, java.io.Serializable {
    protected String nombre;
    protected String telefono;
    protected String noSS;
    protected String grupo;

    public Persona(){}

    public Persona(String nombre, String telefono, String noSS, String grupo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.noSS = noSS;
        this.grupo = grupo;
    }

    public void mostrar(){
        System.out.println(">> Nombre           :" + nombre);
        System.out.println(">> Telefono         :" + telefono);
        System.out.println(">> Seguro Social    :" + noSS);
        System.out.println(">> Grupo            :" + grupo);
    }

    public void capturar(){
        Scanner leer = new Scanner(System.in);
        System.out.print("<< Nombre         :");
        nombre = leer.nextLine();
        System.out.print("<< Telefono       :");
        telefono = leer.nextLine();
        System.out.print("<< Seguro Social  :");
        noSS = leer.nextLine();
        System.out.print("<< Grupo          :");
        grupo = leer.nextLine();
    }

    public String queSoy(){
        return "Persona";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNoSS() {
        return noSS;
    }

    public void setNoSS(String noSS) {
        this.noSS = noSS;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}