/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_dentista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CARLOS
 */
public class DentistaApp {
    private List<Paciente> pacientes;
    private Scanner scanner;

    public DentistaApp() {
        pacientes = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarPaciente() {
        System.out.println("Ingrese el nombre del paciente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del paciente:");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el historial médico del paciente:");
        String historial = scanner.nextLine();

        Paciente paciente = new Paciente(nombre, edad, historial);
        pacientes.add(paciente);

        System.out.println("Paciente agregado con éxito.");
    }

    public void mostrarPacientes() {
        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Nombre: " + paciente.getNombre() + ", Edad: " + paciente.getEdad() +
                    ", Historial: " + paciente.getHistorial());
        }
    }

public void buscarPaciente(String nombre) {
        boolean encontrado = false;
        for (Paciente paciente : pacientes) {
            if (paciente.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Paciente encontrado:");
                System.out.println("Nombre: " + paciente.getNombre() + ", Edad: " + paciente.getEdad() +
                        ", Historial: " + paciente.getHistorial());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Paciente no encontrado.");
        }
    }

    public void agendarCita(String nombre) {
        // Aquí puedes implementar la lógica para agendar una cita para un paciente específico
        System.out.println("Cita agendada para " + nombre);
    }
}
    
    

