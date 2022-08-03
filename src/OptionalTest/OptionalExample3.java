package OptionalTest;

import java.util.Optional;

class User {

    private Address address;

    public Address getAddress() {
        return address;
    }
}

class Address {

    private String street;

    public String getStreet() {
        return street;
    }
}

public class OptionalExample3 {

    public String getStreetJava8() {
        Optional<User> user = Optional.ofNullable(getUser());
        return user.map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
    }

    private static User getUser() {
        return null;
    }

    public static void main(String[] args) {
        OptionalExample3 opt3 = new OptionalExample3();
        System.out.println(opt3.getStreetJava8());
    }
}