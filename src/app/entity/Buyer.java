package app.entity;

public class Buyer {

    private final String name;
    private final String phone;
    private final String email;

    public Buyer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Buyer: %s, %s, %s".formatted(this.name, this.phone, this.email);
    }
}
