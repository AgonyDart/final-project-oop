import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) {
        boolean ciclo = true;
        Escuela escuelota = new Escuela("ITM", "Yo mero", "www.tec.com");
        int op = 1;
        try {
            escuelota.cargarDatos();
            //escuelota.cargarInfo();
            Scanner scanner = new Scanner(System.in);

            // Inicio del sistema
            System.out.println("\n = = = = Bienvenid@ al sistema escolar de " + escuelota.getNombre() + " = = = = ");

            // Inicio del bucle
            int periodo;
            int grupo;
            do {
                System.out.println(" = = = = Hola, por favor inicia sesion = = = = = = = =");
                System.out.print(" >> Usuario        : ");
                String usuario = scanner.nextLine();
                System.out.print(" >> cod. acceso    : ");
                String acceso = scanner.nextLine();
                if (usuario.equals("admin") && acceso.equals("password")) {
                    int seleccion = 0;
                    escuelota.guardarDatos();
                    System.out.println(" >> Guardado []");
                    do {
                        System.out.println("\n >> Trabajando como administrador:\n");
                        seleccion = mostrarAdminMenu();
                        // System.out.println(seleccion);
                        switch (seleccion) {
                            case 0:
                                break;
                            case 6:
                                escuelota.guardarDatos();
                                System.out.println(" >> Guardado []");
                                break;
                            case 11:
                                escuelota.mostrarPeriodo();
                                break;
                            case 12:
                                escuelota.capturarPeriodo();
                                break;
                            case 21:
                                escuelota.mostrarGrupos();
                                break;
                            case 22:
                                escuelota.capturarGrupo();
                                break;
                            case 31:
                                escuelota.mostrarProfesores();
                                break;
                            case 32:
                                escuelota.capturarProfesor();
                                break;
                            case 33:
                                escuelota.buscarProfesores();
                                break;
                            case 34:
                                escuelota.borrarProfesor();
                                break;
                            case 41:
                                escuelota.mostrarEstudiantes();
                                break;
                            case 42:
                                escuelota.capturarEstudiante();
                                break;
                            case 43:
                                escuelota.buscarEstudiantes();
                                break;
                            case 44:
                                escuelota.borrarEstudiante();
                                break;
                            case 51:
                                escuelota.mostrarCalificaciones();
                                break;
                            case 52:
                                escuelota.capturarCalificaciones();
                                break;
                            default:
                                System.out.println("\n>> Operacion no valida");
                                break;
                        }
                    } while (seleccion != 0);

                    break;
                } else if (usuario.equals("escuela") && acceso.equals("password")) {
                    do {
                        // Seleccion periodo
                        escuelota.guardarDatos();
                        System.out.println(" >> Guardado []");
                        System.out.println("\n >> Por favor selecciona el periodo en el que quieres trabajar:");
                        escuelota.mostrarNombrePeriodos();
                        System.out.println("\n\t\t0.- Salir");
                        System.out.print(" << :");
                        periodo = scanner.nextInt() - 1;
                        if (periodo == -1) {
                            break;
                        }
                        periodo = escuelota.getPeriodoId(periodo);
                        String idGrupo = "";
                        do {
                            try {
                                System.out.println("\n >> Trabajando en: " + escuelota.getPeriodoNombre(periodo));
                                System.out.println("\n >> Por favor selecciona el grupo en el que quieres trabajar:");
                                escuelota.mostrarGrupos(periodo);
                                System.out.println("\n\t0.- Salir");
                                System.out.print(" << :");
                                grupo = scanner.nextInt();
                                idGrupo = escuelota.getGrupoId(grupo-1, periodo);
                            } catch (Exception e) {
                                break;
                            }
                            System.out.println("\n >> Por favor selecciona la materia para registrar calificaciones:");
                            String materia = "";
                            try {
                                materia = escuelota.mostrarProfesoresGrupo(grupo - 1, periodo);
                            } catch (Exception e) {
                                break;
                            }
                            do {
                                op = mostrarMenu();
                                switch (op) {
                                    case 0:
                                        ciclo = false;
                                        break;
                                    case 3:
                                        escuelota.guardarDatos();
                                        System.out.println(" >> Guardado []");
                                        break;
                                    case 11:
                                        escuelota.mostrarEstudiantesGrupo(idGrupo);
                                        break;
                                    case 12:
                                        escuelota.capturarEstudianteGrupo(idGrupo);
                                        break;
                                    case 13:
                                        escuelota.buscarEstudiantes();
                                        break;
                                    case 14:
                                        escuelota.borrarEstudiante();
                                        break;
                                    case 21:
                                        escuelota.mostrarCalificaciones(idGrupo);
                                        break;
                                    case 22:
                                        escuelota.capturarCalificacionesAuto(idGrupo, materia);
                                        break;
                                    default:
                                        // System.out.println("\n>> Operacion no valida");
                                        break;
                                }
                            } while (op != 0);
                        } while (grupo != 0);
                    } while (periodo != 0);
                    break;
                } else {
                    System.out.println("\n ** Claves incorrectas\n");
                }
            } while (ciclo);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1.- Estudiantes\t\t2.- Calificaciones\t\t3.- Guardar datos\t\t0.- Salir\n\n << :");
        int op = scanner.nextInt();
        int opcion = 0;
        switch (op) {
            case 1:
                opcion = menuEstudiantes();
                break;
            case 2:
                opcion = menuCalificaciones();
                break;
            case 3:
                opcion = 3;
                break;
            case 0:
                break;
            default:
                // System.out.println("\n>> Operacion no valida");
                break;
        }
        return opcion;
    }

    public static int menuEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir\n\n << :");
        int op = 10 + scanner.nextInt();
        return op;
    }

    public static int menuEstudiantesAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir\n\n << :");
        int op = 40 + scanner.nextInt();
        return op;
    }

    public static int menuCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.- Mostrar     2.-Capturar    0.-Salir");
        int op = 20 + scanner.nextInt();
        return op;
    }

    public static int mostrarAdminMenu() {
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.print(
                    " 1.- Periodos\t\t2.- Grupos\t\t3.- Profesores\n 4.- Estudiantes\t5.- Calificaciones\t6.- Guardar\n\n 0.-Salir\n\n << :");
            opcion = read.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                case 2:
                case 5:
                    System.out.print("\n1.- Mostrar     2.-Capturar    0.-Salir\n\n << :");
                    opcion = (opcion * 10) + read.nextInt();
                    break;
                case 3:
                    opcion = menuProfesoresAdmin();
                    break;
                case 4:
                    opcion = menuEstudiantesAdmin();
                    break;
                case 6:
                    opcion = 6;
                    break;
                default:
                    System.out.println("\n>> Operacion no valida");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return opcion;
    }

    // Metodos de la version anterior

    public static int menuProfesoresAdmin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir\n\n << :");
        int op = 30 + scanner.nextInt();
        return op;
    }

    // public static int menuGrupo() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("1.- Mostrar 2.-Capturar 3.-Lista de Estudiantes
    // 0.-Salir");
    // int op = 30 + scanner.nextInt();
    // return op;
    // }
}