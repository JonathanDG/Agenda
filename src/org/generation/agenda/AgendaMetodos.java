import java.util.Scanner;
import excepciones.NotFoundContactException;

public class AgendaMetodos {

    private Agenda agenda;

    public AgendaMetodos(Agenda agenda) {
        this.agenda = agenda;
    }

    public void listarContactos() {
        System.out.println("\n--- Listado de contactos ---");
        if (agenda == null) {
            System.out.println("La agenda no ha sido inicializada.");
            return;
        }
        if (agenda.espaciosLibres() == agenda.capacidadMaxima) {
            System.out.println("La agenda está vacía.");
        } else {
            agenda.listarContactos();
        }
        System.out.println("----------------------------");
    }

    public void buscaContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido a buscar: ");
        String apellido = scanner.nextLine();

        try {
            Contacto c = agenda.buscarContacto(nombre, apellido);
            if (c == null) {
                throw new NotFoundContactException("El contacto '" + nombre + " " + apellido + "' no se ha encontrado.");
            }
            System.out.println("Teléfono de " + nombre + " " + apellido + ": " + c.getTelefono());
        } catch (NotFoundContactException e) {
            System.out.println("Error al buscar: " + e.getMessage());
        }
    }

    public void eliminarContacto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido del contacto a eliminar: ");
        String apellido = scanner.nextLine();

        Contacto contactoParaEliminar;
        try {
            contactoParaEliminar = new Contacto(nombre, apellido, "");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        boolean eliminado = agenda.eliminarContacto(contactoParaEliminar);
        if (!eliminado) {
            System.out.println("No se pudo eliminar el contacto '" + nombre + " " + apellido + "'. Puede que no exista.");
        }
    }
}
