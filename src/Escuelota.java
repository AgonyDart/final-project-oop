package src;

public class Escuelota {
    private String nombre;
    private String director;
    private String web;
    private Persona personas[] = new Persona[1000];

    public Escuelota(){}

    public Escuelota(String nombre, String director, String web) {
        this.nombre = nombre;
        this.director = director;
        this.web = web;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
