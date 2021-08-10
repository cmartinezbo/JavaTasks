package entidades;

public class Socio extends Persona {
    private final String antiquity;

    public Socio(String name, String userID, String phoneNumber, String location, String antiquity) {
        super(name, userID, phoneNumber, location);
        this.antiquity = antiquity;
    }
}

