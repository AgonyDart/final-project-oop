import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean ciclo = true;
        Escuela escuelota = new Escuela("ITM", "Yo mero", "www.tec.com");
        int op = 1;
        escuelota.cargarDatos();
        Scanner scanner = new Scanner(System.in);

        // Inicio del sistema
        System.out.println("\n = = = = Bienvenid@ a el sistema escolar de " + escuelota.getNombre() + " = = = = ");

        // Inicio del bucle
        try {
            int periodo;
            int maestro;
            do {
                System.out.println(" = = = = Hola, por favor inicia sesion = = = = = = = =");
                System.out.print(" >> Usuario        : ");
                String usuario = scanner.nextLine();
                System.out.print(" >> cod. acceso    : ");
                String acceso = scanner.nextLine();
                if (usuario.equals("admin") && acceso.equals("password")) {
                    break;
                } else {
                    System.out.println("\n ** Claves incorrectas\n");
                }
            } while (true);
            do {
                // Seleccion periodo
                System.out.println("\n >> Por favor selecciona el periodo en el que quieres trabajar:");
                escuelota.mostrarNombrePeriodos();
                System.out.println("\n\t\t0.- Salir");
                System.out.print(" << :");
                periodo = scanner.nextInt() - 1;
                if (periodo == -1) {
                    break;
                }
                periodo = escuelota.getPeriodoId(periodo);
                do {
                    System.out.println("\n >> Trabajando en: " + escuelota.getPeriodoNombre(periodo));
                    System.out.println("\n >> Por favor selecciona el profesor en el que quieres trabajar:");
                    escuelota.mostrarProfesores();
                    System.out.println("\n\t\t0.- Salir");
                    System.out.print(" << :");
                    maestro = scanner.nextInt() - 1;
                    if (maestro == -1) {
                        break;
                    }
                } while (maestro != 0);
           } while(periodo != 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.- Estudiantes\n2.- Profesores\n3.- Grupos\n4.- Guardar datos\n0.- Salir\n\n >> :");
        int op = scanner.nextInt();
        int opcion = 0;
        switch (op) {
            case 1:
                opcion = menuEstudiantes();
                break;
            case 2:
                opcion = menuProfesores();
                break;
            case 3:
                opcion = menuGrupo();
                break;
            case 4:
                opcion = 4;
                break;
            case 0:
                break;
        }
        return opcion;
    }

    public static int menuEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir");
        int op = 10 + scanner.nextInt();
        return op;
    }

    public static int menuProfesores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Mostrar     2.-Capturar     3.-Buscar      4.-Borrar    0.-Salir");
        int op = 20 + scanner.nextInt();
        return op;
    }

    public static int menuGrupo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.- Mostrar     2.-Capturar     3.-Lista de Estudiantes   0.-Salir");
        int op = 30 + scanner.nextInt();
        return op;
    }
}
