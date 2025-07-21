package org.generation.contact;

public class Contact {
    private int number_phone;
    private String name;

    public Contact(int number_phone, String name) {
        this.number_phone = number_phone;
        this.name = name;
    }

    public int getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(int number_phone) {
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
        return "Contact{" +
                "number_phone=" + number_phone +
                ", name='" + name + '\'' +
                '}';
    }
}
