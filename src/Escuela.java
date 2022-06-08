import java.util.*;
import java.io.*;

public class Escuela {
    private String nombre;
    private String director;
    private String web;
    private Persona personas[] = new Persona[1000];
    private Persona personascopy[]= new Persona[100];
    private Grupo grupos[] = new Grupo[10];
    private Periodo periodos[] = new Periodo[100];
    private int cPersons;
    private int cEstudiantes;             //los ocupo para el borrar :)
    private int cProfesores;              //los ocupo para el borrar :)
    private int cGrupos;              //los ocupo para el borrar :)
    private int cPeriodos;              //los ocupo para el borrar :)

    Scanner con=new Scanner(System.in);
    public Escuela(){}

    public Escuela(String nombre, String director, String web) {
        this.nombre = nombre;
        this.director = director;
        this.web = web;
    }

    //metodos
    public void cargarDatos(){
        cargarPersonas();
        cargarPeriodos();
        cargarGrupos();
    }

    public void guardarDatos(){
        guardarPersonas();
        guardarPeriodos();
        guardarGrupos();
    }


    public void cargarPersonas(){
        FileInputStream fe=null;
        cPersons=0;
        try{
            fe=new FileInputStream("data.dat");
            ObjectInputStream fObj=new ObjectInputStream(fe);
            personas[cPersons]=(Persona)fObj.readObject();                     //Ni idea de por que si quito esta linea ya no lee los datos XD
            while(personas[cPersons]!=null){
                cPersons++;
                personas[cPersons]=(Persona)fObj.readObject();
                if(personas[cPersons].queSoy().equals("Estudiante"))
                    cEstudiantes++;
                if(personas[cPersons].queSoy().equals("Profesor"))
                    cProfesores++;

            }
            periodos[cPeriodos]=(Periodo)fObj.readObject();
            while (periodos[cPeriodos] != null) {
                cPeriodos++;
                periodos[cPeriodos] = (Periodo)fObj.readObject();
            }
            fe.close();
        }
        catch(Exception e){
            System.out.println(" (Datos cargados: [100%])");
        }
    }

    public void guardarPersonas(){
        FileOutputStream fs=null;
        try{
            fs=new FileOutputStream("data.dat");
            ObjectOutputStream fObj=new ObjectOutputStream(fs);
            for(int i=0;i<cPersons;i++){
                fObj.writeObject(personas[i]);
                if(personas[i].queSoy().equals("Estudiante"))
                    cEstudiantes++;
                if(personas[i].queSoy().equals("Profesor"))
                    cProfesores++;
            }
            fs.close();
            System.out.println(" >> Guardando...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    // Periodos
    public void cargarInfo() {
        grupos[0] = new Grupo(1001, "K6", "1A", "101", "LE007");
        grupos[1] = new Grupo(1001, "F6", "2B", "102", "SA006");
        grupos[2] = new Grupo(1001, "F2", "3C", "103", "EM037");
        grupos[3] = new Grupo(1002, "I3", "1B", "201", "RA007");
        grupos[4] = new Grupo(1002, "J21", "2C", "202", "LE007");
        grupos[5] = new Grupo(1002, "P5", "3A", "203", "LE007");
        grupos[6] = new Grupo(1003, "M8", "1C", "301", "LE007");
        grupos[7] = new Grupo(1003, "T1", "2A", "302", "LE007");
        grupos[8] = new Grupo(1003, "L7", "3B", "303", "LE007");

        cGrupos = 8;

        personas[0] = new Profesor("Leonardo G.", "44318232334", "LE007", "1A", "rfc", "1234 5678", "Licenciatura", "Matematicas");
        personas[1] = new Profesor("Samar S.", "44318232334", "SA006", "2B", "rfc", "1234 5678", "Doctorado", "Quimica");
        personas[2] = new Profesor("Emir", "44318232334", "EM037", "3C", "rfc", "1234 5678", "Maestria", "Literatura");
        personas[3] = new Profesor("Ramiro T.", "44318232334", "RA007", "1B", "rfc", "1234 5678", "Postgrado", "Programacion");
        personas[4] = new Profesor("Perla D.", "44318232334", "PE032", "2C", "rfc", "1234 5678", "Licenciatura", "Biologia");
        personas[5] = new Profesor("Fernando A.", "44318232334", "FE007", "3A", "rfc", "1234 5678", "Tecnico", "Fisica");
        personas[6] = new Profesor("Julio C.", "44318232334", "JU003", "1C", "rfc", "1234 5678", "Licenciatura", "Ingles");
        personas[7] = new Profesor("Miguel A.", "44318232334", "MI007", "2A", "rfc", "1234 5678", "Maestria", "Geografia");
        personas[8] = new Profesor("Carlos H.", "44318232334", "CA127", "3B", "rfc", "1234 5678", "Licenciatura", "Historia");

        cPersons = 8;

    }

    public void cargarPeriodos() {
        cPeriodos = 0;
        try {
            FileInputStream fileIn = new FileInputStream("periodos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            periodos[cPeriodos] = (Periodo) in.readObject();
            while (periodos[cPeriodos]!=null) {
                cPeriodos++;
                periodos[cPeriodos] = (Periodo) in.readObject();
            }
            in.close();
            fileIn.close();
         } catch (Exception i) {
            i.printStackTrace();
         }
    }

    public void guardarPeriodos() {
        try {
            FileOutputStream fileOut = new FileOutputStream("periodos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Periodo p : periodos) {
                out.writeObject(p);
            }
            out.close();
            fileOut.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarNombrePeriodos(){
        for (int i = 0; i < cPeriodos && periodos[i] != null; i++) {
            System.out.println("\t\t" + (i + 1) + ".- " + periodos[i].getNombre());
        }
    }

    public void mostrarPeriodo(){
        for (int i = 0; i < cPeriodos; i++) {
            periodos[i].mostrar();
        }
    }

    public void capturarPeriodo(){
        periodos[cPeriodos]= new Periodo();
        periodos[cPeriodos].capturar();
        cPeriodos++;
    }

    public int getPeriodoId(int index) {
        return periodos[index].getIdPeriodo();
    }

    public String getPeriodoNombre(int id) {
        for(int i = 0; i <= cPeriodos && periodos[i] != null; i++){
            String indexer = String.valueOf(periodos[i].getIdPeriodo());
            if(indexer.contains(String.valueOf(id))) {
                return periodos[i].getNombre();
            }
            indexer = "";
        }
        return null;
    }

    //Estudiantes
    public void mostrarEstudiantes(){
        Scanner con = new Scanner(System.in);
        int c = 0;
        int indexEstudiantes[] = indexEstudiantes();
        for(int i = 0; i < cPersons; i++){
            if(personas[i].queSoy().equalsIgnoreCase("Estudiante")){
                System.out.println((c + 1) + ".- " + personas[i].getNombre());
                c++;
            }
        }
        System.out.println(cEstudiantes);
        System.out.println(" >> Si quieres ver los datos de algun estudiante selecciona el numero \nde lo contrario selecciona 0");
        int opcion = con.nextInt() - 1;
        if(opcion!=-1){
            personas[indexEstudiantes[opcion]].mostrar();
        }

    }

    public void capturarEstudiante(){
        personas[cPersons]= new Estudiante();
        personas[cPersons].capturar();
        cPersons++;
        cEstudiantes++;
    }

    public void borrarEstudiante(){
        Scanner con=new Scanner(System.in);
        int cont=0;
        int indexEstudiantes[]=indexEstudiantes();
        for(int i=0;i<cPersons;i++){
            if(personas[i].queSoy().equalsIgnoreCase("Estudiante")){
                System.out.println((cont+1) + ".- "+personas[i].getNombre());
                cont++;
            }
        }
        System.out.println("Selecciona el estudiante a borrar");
        int index = indexEstudiantes[con.nextInt()-1];
        int restantes= cPersons-(index+1);
        System.arraycopy(personas, 0, personascopy, 0, index);
        System.arraycopy(personas, index+1, personascopy, index, restantes);
        cPersons--;
        System.arraycopy(personascopy, 0, personas, 0, cPersons);
        System.out.println("Eliminado, NO OLVIDES GUARDAR LOS CAMBIOS");
    }

    public int[] indexEstudiantes(){
        int indexEstudiantes[] =new int[cEstudiantes+1];
        int cont =0;
        for(int i=0;i<cPersons;i++){
            if(personas[i].queSoy().equalsIgnoreCase("Estudiante")){
                indexEstudiantes[cont]=i;
                cont++;
            }
        }
        return indexEstudiantes;
    }

    public void buscarEstudiantes(){
        Scanner con=new Scanner(System.in);
        System.out.println("Ingrese algun caracter a buscar");
        String cadena = con.nextLine();
        cadena = cadena.toLowerCase();
        String megacadena;
        for(int i=0;i<cPersons;i++){
            Estudiante e;
            if(personas[i].queSoy().equals("Estudiante"))
                e=(Estudiante)personas[i];
            else
                continue;
            megacadena=e.getNoControl()+e.getMaterias()+e.getNombre()+e.getGrupo()+e.getTelefono()+e.getNoSS();
            megacadena=megacadena.toLowerCase();
            if(megacadena.contains(cadena))
                personas[i].mostrar();
            megacadena="";
        }
    }

    //Profesores
    public void capturarProfesor(){
        personas[cPersons]= new Profesor();
        personas[cPersons].capturar();
        cPersons++;
        cProfesores++;
    }

    public void mostrarProfesores(){
        Scanner con=new Scanner(System.in);
        int cont=0;
        int indexProfesores[]=indexProfesores();
        for(int i=0;i<cPersons;i++){
            if(personas[i].queSoy().equalsIgnoreCase("Profesor")){
                System.out.println("\t" + (cont+1) + ".- "+personas[i].getNombre());
                cont++;
            }
        }
        System.out.println("Si quieres ver los datos de algun Profesor selecciona el numero \nde lo contrario selecciona 0");
        int opcio=con.nextInt()-1;
        if(opcio!=-1){
            personas[indexProfesores[opcio]].mostrar();
        }
    }


    public int[] indexProfesores(){
        int indexProfesores[] =new int[cProfesores+1];
        int cont =0;
        for(int i=0;i<cPersons;i++){
            if(personas[i].queSoy().equalsIgnoreCase("Profesor")){
                indexProfesores[cont]=i;
                cont++;
            }
        }
        return indexProfesores;
    }

    public void buscarProfesores(){
        Scanner con=new Scanner(System.in);
        System.out.println("Ingrese algun caracter a buscar");
        String cadena = con.nextLine();
        cadena = cadena.toLowerCase();
        String megacadena;
        for(int i=0;i<cPersons;i++){
            Profesor e;
            if(personas[i].queSoy().equals("Profesor"))
                e=(Profesor)personas[i];
            else
                continue;
            megacadena=e.getNombre()+e.getAsignatura()+e.getGradoEstudios()+e.getRfc();
            megacadena=megacadena.toLowerCase();
            if(megacadena.contains(cadena))
                personas[i].mostrar();
            megacadena="";
        }
    }

    public void borrarProfesor(){
        Scanner con=new Scanner(System.in);
        int cont=0;
        int indexProfesores[]=indexProfesores();
        for(int i=0;i<cPersons;i++){
            if(personas[i].queSoy().equalsIgnoreCase("Profesor")){
                System.out.println((cont+1) + ".- "+personas[i].getNombre());
                cont++;
            }
        }
        System.out.println("Selecciona el Profesor a borrar");
        int index = indexProfesores[con.nextInt()-1];
        int restantes= cPersons-(index+1);
        System.arraycopy(personas, 0, personascopy, 0, index);
        System.arraycopy(personas, index+1, personascopy, index, restantes);
        cPersons--;
        System.arraycopy(personascopy, 0, personas, 0, cPersons);
        System.out.println("Eliminado, NO OLVIDES GUARDAR LOS CAMBIOS");
    }

    //Grupos
    public void guardarGrupos(){
        try {
            FileOutputStream fileOut = new FileOutputStream("grupos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Grupo g : grupos) {
                out.writeObject(g);
            }
            out.close();
            fileOut.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cargarGrupos(){
        cGrupos = 0;
        try {
            FileInputStream fileIn = new FileInputStream("grupos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            grupos[cGrupos] = (Grupo) in.readObject();
            while (grupos[cGrupos]!=null) {
                cGrupos++;
                grupos[cGrupos] = (Grupo) in.readObject();
            }
            in.close();
            fileIn.close();
         } catch (Exception i) {
            i.printStackTrace();
         }
    }

    public void capturarGrupo(){
        grupos[cGrupos]= new Grupo();
        grupos[cGrupos].capturar();
        cGrupos++;
	}

	public void mostrarGrupos(){
        for(int i=0;i<cGrupos;i++)
                grupos[i].mostrar();
	}

    public void mostrarGrupos(int idPeriodo){
        int index = 0;
        for (int i = 0; i <= cGrupos && grupos[i] != null; i++) {
            if (grupos[i].getIdPeriodo() == idPeriodo) {
                index++;
                System.out.println("\t" + index + ".- " + grupos[i].getNombre());
            }
        }
	}

    public void mostrarProfesoresGrupo(int index, int idPeriodo){
        Scanner con=new Scanner(System.in);
        int index1[] = indexGrupos(idPeriodo);
        int index2 = index1[index];
        String refProfesor = grupos[index2].getRefProfesor();
        refProfesor = refProfesor.toLowerCase();
        int cont=0;
        System.out.println("hola"+ index2);
        for(int i=0;i<cPersons;i++){
            Profesor e;
            if(personas[i].queSoy().equals("Profesor")){
                e=(Profesor)personas[i];
                String noSS=e.getNoSS().toLowerCase();
                if(noSS.equals(refProfesor)){
                    System.out.println((cont+1)+ ".- "+e.getAsignatura());
                    cont++;
                }
            }
        }
    }

    public int[] indexGrupos(int idPeriodo){
        int index = 0;
        int indexGrupos[] =new int[cGrupos+1];
        for (int i = 0; i < cGrupos; i++) {
            if (grupos[i].getIdPeriodo() == idPeriodo) {
                indexGrupos[index]=i;
                index++;
            }
        }
        return indexGrupos;
	}
    // int indexProfesores[] =new int[cProfesores+1];
    //     int cont =0;
    //     for(int i=0;i<cPersons;i++){
    //         if(personas[i].queSoy().equalsIgnoreCase("Profesor")){
    //             indexProfesores[cont]=i;
    //             cont++;
    //         }
    //     }
    //     return indexProfesores;

    //encapsulamiento
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

    public int getcPeriodos(){
        return cPeriodos;
    }
}
