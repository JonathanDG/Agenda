package org.generation.main;

import org.generation.agenda.Agenda;
import org.generation.contact.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        Agenda agenda = new Agenda(10);
        do{
            System.out.println("Desea establecer tamaño de agenda o prefiere el tamaño por defecto?");
            System.out.println("1. Por defecto \n2. Establecer tamaño\n");
            op = scanner.nextInt();

            if(op == 1){
                break;
            }else if(op == 2){
                System.out.println("Ingrese el tamaño máximo de la agenda: ");

                int maxTam = scanner.nextInt();
                scanner.nextLine();

                agenda = new Agenda(maxTam);
            }else{
                System.out.println("Opcion invalida");
            }
        }while(op != 1 && op != 2 );



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
                    System.out.println("Apellido: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Numero de Telefono: ");
                    Long phoneNumber = scanner.nextLong();

                    Contacto contacto = new Contacto(phoneNumber, name, lastName);
                    if (agenda.isContact(contacto)){
                        System.out.println("El contacto ya existe. Favor de ingresar uno nunevo.");
                    }else{
                        agenda.addContact(contacto);
                    }
                    break;
                case 2:
                    System.out.println("Nombre de contacto a buscar: ");
                    String nameToSearch = scanner.nextLine();
                    agenda.buscaContacto(nameToSearch);

                    break;
                case 3:
                    System.out.println("Nombre de contacto a eliminar: ");
                    String nameToDelete = scanner.nextLine();
                    agenda.deleteContact(nameToDelete);
                    break;

                case 4:
                    agenda.getContactos();

                    break;
                case 5:
                    if(agenda.agendaLlena()){
                        System.out.println("\nLa agenda está llena");
                    } else {
                        System.out.println("\nLa agenda aún tiene esapcio");
                    }
                    break;
                case 6:
                    if(agenda.espacioLibres() == 0){
                        System.out.println("\nNO hay espacios libres");
                    } else{
                        System.out.println("\nHay " + agenda.espacioLibres() + " espacios libres.");
                    }
                    break;
                case 7:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 7);
    }
}
