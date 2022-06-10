import java.util.Scanner;


public class Estudiante extends Persona{
    private String noControl;
    private String genero;
    private boolean estado;
    private Materia materias[];

    public Estudiante(){}

    public Estudiante(String nombre, String telefono, String noSS, String grupo, String noControl, String genero, boolean estado) {
        super(nombre, telefono, noSS, grupo);
        this.noControl = noControl;
        this.genero = genero;
        this.estado = estado;
    }

    @Override
    public void mostrar() {
        System.out.println("\n << << Mostrar Estudiante >> >>");
        super.mostrar();
        System.out.println(">> No de Control    :" + noControl);
        System.out.println(">> Genero           :" + genero);
        System.out.println(">> Estado           :" + estado);
        // System.out.println(">> Materias       :" + materias);
    }

    @Override
    public void capturar() {
        Scanner con = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Estudiante << << )");
        super.capturar();
        noControl= "2112"+ nombre.substring(0,1);
        System.out.print(">> Genero         :" );
        genero=con.nextLine();
        estado=true;
    }

    @Override
    public void capturarConGrupo(String nombreGrupo) {
        Scanner con = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Estudiante << << )");
        super.capturarConGrupo(nombreGrupo);
        noControl= "2112" + nombre.substring(0,1);
        System.out.print(">> Genero         :" );
        genero=con.nextLine();
        estado=true;
    }

    @Override
    public String queSoy() {
        return "Estudiante";
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
}