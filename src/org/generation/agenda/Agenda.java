package org.generation.agenda;

import org.generation.contact.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private final List<Contact> agenda = new ArrayList<>();
    private int maxTam = 10;


    public Agenda(int maxTam) {
        this.maxTam = maxTam;
    }

    public Agenda(){
        this.maxTam = 10;
    }

    public void getContactos() {
        Iterator<Contact> iterador = agenda.iterator();

        while (iterador.hasNext()){
            Contact contact = iterador.next();
            System.out.println(contact.toString());
        }

    }

    //Añade un contacto a la agenda. Si no hay espacio suficiente, se debe indicar al usuario que la agenda está llena.

    public void addContact(Contacto contacto) {
        if(agendaLlena){
            System.out.println("Agenda llena, no se puede agregar otro contacto");
            return;
        }else(isContact(contacto)){
            System.out.println("Contacto repetido");
            return;
        }
        this.agenda.add(contacto);
        System.out.println("Contacto agregado correctamente...");
    }

    public void deleteContact(String nombre) {

    }
    //existeContacto(contacto C) boolean, Verifica si un contacto ya existe en la agenda.
    //Los contactos se consideran iguales si tienen el mismo nombre y apellido, sin importar el teléfono.

    public isContact(Contacto contacto) {
        for(Contacto c:agenda){ //ciclo for each donde el indice c recorre toda la lista agenda
            if(c.getNombre().equalsIgnoreCase(contacto.getNombre()) && //equalsIgnoreCase ignora entre mayusculas y minusculas
            c.getApellido().equalsIgnoreCase(contacto.getApellido())) {
            return true;
        }
    }
    return false;
    }

    public boolean agendaLlena() {
        if (agenda.size() == maxTam){
            return true;
        }
        else {
            return false;
        }
    }
    public int espacioLibres() {
        if (agendaLlena()){
            return 0;
        }
        return maxTam - agenda.size();
    }


}
