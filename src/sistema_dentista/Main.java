/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_dentista;

/**
 *
 * @author CARLOS
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        DentistaApp app = new DentistaApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar Paciente");
            System.out.println("2. Mostrar Pacientes");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción:");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    app.agregarPaciente();
                    break;
                case 2:
                    app.mostrarPacientes();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }
    }
}
