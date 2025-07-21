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

    public void addContact(Contact contacto) {
        agenda.add(contacto);
    }

    public void deleteContact(String nombre) {

    }

    public boolean isContact() {

        return true;
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
