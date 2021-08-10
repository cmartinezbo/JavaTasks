public class Socio extends Persona {

    private final int antiquity;

    public Socio(int antiquity) {
        super(name, userID, phoneNumber, location);
        this.antiquity = antiquity;
    }
}
