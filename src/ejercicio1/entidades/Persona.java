package ejercicio1.entidades;

public class Persona {
    // attributes
    private final String name;
    private final String id;
    private final int phoneNumber;
    private final String address;

    // constructor
    public Persona(String name, String id, int phoneNumber, String address) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
