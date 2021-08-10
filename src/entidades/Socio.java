package entidades;

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
        return "Socio { " +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", antiquity='" + antiquity + '\'' +
                " } ";
    }
}

