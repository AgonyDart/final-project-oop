import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean ciclo = true;
        Escuela escuelota = new Escuela("ITM", "Yo mero", "www.tec.com");
        int op = 1;
        escuelota.cargarDatos();
        //escuelota.cargarInfo();
        Scanner scanner = new Scanner(System.in);

        // Inicio del sistema
        System.out.println("\n = = = = Bienvenid@ al sistema escolar de " + escuelota.getNombre() + " = = = = ");

        // Inicio del bucle
        try {
            int periodo;
            int grupo;
            int asignatura;
            do {
                System.out.println(" = = = = Hola, por favor inicia sesion = = = = = = = =");
                System.out.print(" >> Usuario        : ");
                String usuario = scanner.nextLine();
                System.out.print(" >> cod. acceso    : ");
                String acceso = scanner.nextLine();
                if (usuario.equals("admin") && acceso.equals("password")) {
                    break;
                } else if (usuario.equals("0") && acceso.equals("0")) {
                    break;
                } else {
                    System.out.println("\n ** Claves incorrectas\n");
                }
            } while (true);
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
                        idGrupo = escuelota.getGrupoId(grupo - 1, periodo);
                    } catch (Exception e) {
                        break;
                    }
                    System.out.println("\n >> Por favor selecciona la materia para registrar calificaciones:");
                    String materia = "";
                    try {
                        materia = escuelota.mostrarProfesoresGrupo(grupo - 1, periodo);
                        System.out.println(materia);
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
                        }
                    } while (op != 0);
                } while (grupo != 0);
            } while (periodo != 0);
        } catch (Exception e) {
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
        }
        return opcion;
    }

    public static int menuEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir\n\n << :");
        int op = 10 + scanner.nextInt();
        return op;
    }

    public static int menuCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1.- Mostrar     2.-Capturar    0.-Salir");
        int op = 20 + scanner.nextInt();
        return op;
    }

    // Metodos para la version anterior
    // public static int menuProfesores() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("1.- Mostrar 2.-Capturar 3.-Buscar 4.-Borrar 0.-Salir");
    // int op = 20 + scanner.nextInt();
    // return op;
    // }

    // public static int menuGrupo() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("1.- Mostrar 2.-Capturar 3.-Lista de Estudiantes
    // 0.-Salir");
    // int op = 30 + scanner.nextInt();
    // return op;
    // }
}