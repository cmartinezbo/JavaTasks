package ejercicio1.entidades;

public class Socio extends Persona {
    // attributes
    private final String antiquity;

    // constructor
    public Socio(String name, String id, int phoneNumber, String address, String antiquity) {
        super(name, id, phoneNumber, address);
        this.antiquity = antiquity;
    }

    @Override
    public String toString() {
        return  "   Persona Socio - Nombre: " + getName() + "\n" +
                "   Identificación: " + getId() + "\n" +
                "   Teléfono: " + getPhoneNumber() + "\n" +
                "   Dirección: " + getAddress() + "\n" +
                "   Antigüedad: " + antiquity + " años";
    }
}

