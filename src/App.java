package src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean ciclo=true; 
        Escuelota escuelota=new Escuelota("El tec" ,"Yo mero","www.tec.com");
        Scanner sca=new Scanner(System.in);
        int op=0;
        escuelota.loadData();
        do{
            op= mostrarMenu();
            
            switch(op){
                case 0:
                    ciclo=false; break;
                case 4:
                    escuelota.saveData();
                    System.out.println("Guardado");
                    break;
                case 11:
                    escuelota.mostrarEstudiantes();
                    break;
                case 12:
                    escuelota.capturarEstudiante();
                    break;
                case 14:
                    escuelota.borrarEstudiante();
                    break;
                case 21:
                    escuelota.mostrarProfesores();
                    break;
                case 22:
                    escuelota.capturarProfesor();
                    break;
                case 24:
                    escuelota.borrarProfesor();
                    break;
            }
        }while(ciclo);
    }

    public static int mostrarMenu(){
        Scanner sca=new Scanner(System.in);
        System.out.println("--------------Bienvenido a el programita, ingresa a un menu-------------");
        System.out.println("1.- Estudiantes       2.-Profesores       3.-Grupo     4.-Guardar datos   0.-Salir");
        int op=sca.nextInt();
        int opcion=0;
        switch(op){
            case 1:
                opcion=menuEstudiantes();
                break;
            case 2:
                opcion=menuProfesores();
                break;
            case 3:
                break;
            case 4:
                opcion=4;
                break; 
            case 0:
                break;
        }
        return opcion;
    }

    public static int menuEstudiantes(){
        Scanner sca=new Scanner(System.in);
        System.out.println("1.- Mostrar     2.-Capturar     3.Editar     4.-Borrar    0.-Salir");
        int op=10+ sca.nextInt();
        return op;
    }

    public static int menuProfesores(){
        Scanner sca=new Scanner(System.in);
        System.out.println("1.- Mostrar     2.-Capturar     3.Editar     4.-Borrar    0.-Salir");
        int op=20+ sca.nextInt();
        return op;
    }
}
