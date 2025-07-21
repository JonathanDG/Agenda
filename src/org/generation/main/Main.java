package org.generation.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño máximo de la agenda: ");
        int maxTam = scanner.nextInt();
        scanner.nextLine();  // Limpiar buffer

        Agenda agenda = new Agenda(maxTam);
        AgendaMetodos agendaMetodos = new AgendaMetodos(agenda);

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE AGENDA ---");
            System.out.println("3. Buscar contacto existente");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar teléfono");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 3:
                    agendaMetodos.buscaContacto();
                    break;

                case 4:
                    agendaMetodos.eliminarContacto();
                    break;

                case 5:
                    modificarTelefono(scanner, agenda);
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void modificarTelefono(Scanner scanner, Agenda agenda) {
        System.out.print("Nombre del contacto: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido del contacto: ");
        String apellido = scanner.nextLine();
        System.out.print("Nuevo teléfono: ");
        String nuevoTelefono = scanner.nextLine();

        boolean modificado = agenda.modificarTelefono(nombre, apellido, nuevoTelefono);
        if (modificado) {
            System.out.println("Teléfono modificado exitosamente.");
        } else {
            System.out.println("No se pudo modificar el teléfono, contacto no encontrado.");
        }
    }
}
