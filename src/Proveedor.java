public class Proveedor extends Persona {

    private final String product;

    public Proveedor(String product) {
        super(name, userID, phoneNumber, location);
        this.product = product;
    }
}
