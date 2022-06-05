package src;

import java.util.Scanner;

public class Profesor extends Persona {
    private String rfc;
    private String cuentaBancaria;
    private String gradoEstudios;
    private String asignatura;

    public Profesor(){}

    public Profesor(String nombre, String telefono, String noSS, String grupo, String rfc, String cuentaBancaria, String gradoEstudios, String asignatura) {
        super(nombre, telefono, noSS, grupo);
        this.rfc = rfc;
        this.cuentaBancaria = cuentaBancaria;
        this.gradoEstudios = gradoEstudios;
        this.asignatura = asignatura;
    }

    @Override
    public void mostrar() {
        System.out.println("\n << << Mostrar Profesor >> >>");
        super.mostrar();
        System.out.println(">> Rfc              :" + rfc);
        System.out.println(">> Cuenta           :" + cuentaBancaria);
        System.out.println(">> Grado de Est.    :" + gradoEstudios);
        System.out.println(">> Asignatura       :" + asignatura);
    }

    @Override
    public void capturar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n( >> >> Capturar Profesor << << )");
        super.capturar();
        System.out.print("<< Rfc            :");
        rfc = leer.nextLine();
        System.out.print("<< Cuenta         :");
        cuentaBancaria = leer.nextLine();
        System.out.print("<< Grado de Est.  :");
        gradoEstudios = leer.nextLine();
        System.out.print("<< Asignatura     :");
        asignatura = leer.nextLine();
    }

    @Override
    public String queSoy() {
        return "Profesor";
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getGradoEstudios() {
        return gradoEstudios;
    }

    public void setGradoEstudios(String gradoEstudios) {
        this.gradoEstudios = gradoEstudios;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}