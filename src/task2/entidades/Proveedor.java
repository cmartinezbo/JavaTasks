package task2.entidades;

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
        return  "   Persona Proveedor - Nombre: " + getName() + "\n" +
                "   Identificación: " + getId() + "\n" +
                "   Teléfono: " + getPhoneNumber() + "\n" +
                "   Dirección: " + getAddress() + "\n" +
                "   Producto: " + product;
    }
}