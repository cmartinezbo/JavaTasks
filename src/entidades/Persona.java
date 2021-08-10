package entidades;

public class Persona {
    // Attributes
    private final String name;
    private final String userID;
    private final String phoneNumber;
    private final String location;

    // Constructor
    public Persona(String name, String userID, String phoneNumber, String location) {
        this.name = name;
        this.userID = userID;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", userID=" + userID +
                ", phoneNumber=" + phoneNumber +
                ", location='" + location + '\'' +
                '}';
    }


}