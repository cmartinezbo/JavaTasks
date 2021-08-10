package entidades;

public class Proveedor extends Persona {
    private final String product;

    public Proveedor(String product, String name, int userID, int phoneNumber, String location) {
        super(name, userID, phoneNumber, location);
        this.product = product;
    }
}
