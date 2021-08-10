package entidades;

public class Proveedor extends Persona {
    // attributes
    private final String product;

    // constructor
    public Proveedor(String name, String id, int phoneNumber, String location, String product) {
        super(name, id, phoneNumber, location);
        this.product = product;
    }

    @Override
    public String toString() {
        return "Proveedor { " +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", phoneNumber=" + getPhoneNumber() +
                ", address='" + getAddress() + '\'' +
                ", product='" + product + '\'' +
                " } ";
    }
}

