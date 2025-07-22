package org.generation.contact;

import java.lang.*;

public class Contacto {
    private Long number_phone;
    private String name;
    private String lastName;

    public Contacto(Long number_phone, String name, String lastName) {
        this.number_phone = number_phone;
        this.name = name;
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(Long number_phone) {
        this.number_phone = number_phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nombre: " + name +  "\tApellido: " +lastName + "\tTelefono: " + number_phone;
    }
}
