import java.util.Scanner;

public class Materia implements Interfaz{
    private String nombre;
    private String unidades;
    private boolean materialAux;
    private int calificaciones[];

    public Materia(){}

    public Materia(String nombre, String unidades, boolean materialAux, int calificaciones[]){
        this.nombre = nombre;
        this.unidades = unidades;
        this.materialAux = materialAux;
        this.calificaciones = calificaciones;
    }

    public void mostrar() {
        System.out.println("\n << << Mostrar Materia >> >>");
        System.out.println(">> Nombre           :" + nombre);
        System.out.println(">> Unidades         :" + unidades);
        System.out.println(">> Material Aux     :" + String.valueOf(materialAux));
        System.out.println(">> Calificaciones   :" + calificaciones);
    }

    public void capturar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Materia << << )");
        System.out.print("<< Nombre         :");
        nombre = leer.nextLine();
        System.out.print("<< Unidades       :");
        unidades = leer.nextLine();
        System.out.print("<< Material Aux   :");
        materialAux = leer.nextBoolean();
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("<< Calificaciones " + i + ":");
            calificaciones[i] = leer.nextInt();
        }
        leer.close();
    }

    public String queSoy() {
        return "Materia";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public boolean getMaterialAux(){
        return materialAux;
    }

    public void setMaterialAux(boolean materialAux) {
        this.materialAux = materialAux;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}
