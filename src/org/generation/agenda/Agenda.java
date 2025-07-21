package org.generation.agenda;

import org.generation.contact.Contacto;
import org.generation.exception.NotFoundContactException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private final List<Contacto> agenda = new ArrayList<>();
    private int maxTam = 10;


    public Agenda(int maxTam) {
        this.maxTam = maxTam;
    }

    public Agenda(){
        this.maxTam = 10;
    }

    public void getContactos() {
        Iterator<Contacto> iterador = agenda.iterator();

        while (iterador.hasNext()){
            Contacto contact = iterador.next();
            System.out.println(contact.toString());
        }

    }
    public boolean agendaLlena() {
        if (agenda.size() == maxTam){
            return true;
        }
        else {
            return false;
        }
    }

    //Añade un contacto a la agenda. Si no hay espacio suficiente, se debe indicar al usuario que la agenda está llena.

    public void addContact(Contacto contacto) {
        if(agendaLlena()){
            System.out.println("Agenda llena, no se puede agregar otro contacto");
            return;
        }else if (isContact(contacto)){
            System.out.println("Contacto repetido");
            return;
        }
        this.agenda.add(contacto);
        System.out.println("Contacto agregado correctamente...");
    }

    // Buscar contacto
    public int findContact(String nombre) {
        int index = 1;
        for(Contacto contacto: agenda) {
            boolean contactoEncontrado = contacto.getName().equalsIgnoreCase(nombre);
            if (contactoEncontrado) {
                return index;
            }
            index++;
        }
        throw new NotFoundContactException("No se encontro el contatco");
    }

    // Eliminar contacto
    public void deleteContact(String nombre) {
        int index = findContact(nombre); //Indice del elemento a eliminar
        agenda.remove(index); // Eliminar elemento de la lista
    }
    //existeContacto(contacto C) boolean, Verifica si un contacto ya existe en la agenda.
    //Los contactos se consideran iguales si tienen el mismo nombre y apellido, sin importar el teléfono.

    public boolean isContact(Contacto contacto) {
        for(Contacto c:agenda){ //ciclo for each donde el indice c recorre toda la lista agenda
            if(c.getName().equalsIgnoreCase(contacto.getName()) && //equalsIgnoreCase ignora entre mayusculas y minusculas
            c.getLastName().equalsIgnoreCase(contacto.getLastName())) {
                return true;
            }
        }
        return false;
    }


    public int espacioLibres() {
        if (agendaLlena()){
            return 0;
        }
        return maxTam - agenda.size();
    }
    
}
