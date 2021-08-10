public class Socio extends Persona {
    private final int antiquity;

    public Socio(int antiquity, String name, int userID, int phoneNumber, String location) {
        super(name, userID, phoneNumber, location);
        this.antiquity = antiquity;
    }
}
