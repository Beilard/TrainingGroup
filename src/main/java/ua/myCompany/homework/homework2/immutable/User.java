package ua.myCompany.homework.homework2.immutable;

/* 1. Put final everywhere
   2. Constructor should create a copy of the passed mutable objects
   3. The getters should return a copy of the object.
 */

public final class User {
    private final String name;
    private final Address address;

    public User(String name, Address address) {
        this.name = name;
        if (address != null) {
            this.address = new Address(address.getCity(), address.getCode());
        } else {
            this.address = null;
        }
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(this.address.getCity(), this.address.getCode());
    }
}
