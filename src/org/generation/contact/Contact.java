package org.generation.contact;

public class Contact {
    private Long number_phone;
    private String name;

    public Contact(Long number_phone, String name) {
        this.number_phone = number_phone;
        this.name = name;
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
        return "Nombre → " +name + "\tTelefono → " + number_phone;
    }
}
