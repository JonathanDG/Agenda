package org.generation.main;

import org.generation.agenda.Agenda;
import org.generation.contact.Contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño máximo de la agenda: ");
        int maxTam = scanner.nextInt();
        scanner.nextLine();

        Agenda agenda = new Agenda(maxTam);

        int opcion;

        do {
            System.out.println("\n--- MENÚ DE AGENDA ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto existente");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Ver si agenda esta llena");
            System.out.println("6. Ver espacios libres");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.println("Numero de Telefono: ");
                    Long phoneNumber = scanner.nextLong();
                    Contact contacto = new Contact(phoneNumber, name);
                    contacto.setName(scanner.nextLine());
                    agenda.addContact(contacto);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    agenda.getContactos();

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:

            }

        } while (opcion != 7);
    }
}
