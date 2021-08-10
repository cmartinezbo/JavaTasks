package entidades;

public class Proveedor extends Persona {
    private final String product;

    public Proveedor(String name, String userID, String phoneNumber, String location, String product) {
        super(name, userID, phoneNumber, location);
        this.product = product;
    }
}

