package org.generation.contact;

public class Contacto {
    private Long numberPhone;
    private String name;
    private String lastName;

    public Contacto(Long number_phone, String name, String lastName) {
        this.numberPhone = number_phone;
        this.name = name;
        this.lastName = lastName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getNumberPhone() {
        return numberPhone;
    }

    public void setNumber_phone(Long number_phone) {
        this.numberPhone = number_phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nombre → " +name + "\tTelefono → " + numberPhone;
    }
}
