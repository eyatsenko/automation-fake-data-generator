package data;

import java.util.Random;

public class Email {
    private String firstName;
    private String lastName;
    private int randomNumber = new Random().nextInt(99);
    private Integer year = new Random().nextInt(2021);
    private String domain;
    private String email;

    public Email(String lastName, String firstName, String domain) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.domain = domain;
        this.email = lastName + "." + firstName + "@" + domain;
    }

    public Email(String firstName, int randomNumber, String domain) {
        this.firstName = firstName;
        this.randomNumber = randomNumber;
        this.domain = domain;
        this.email = firstName + randomNumber + "@" + domain;
    }

    public Email(String lastName, Integer year, String domain) {
        this.year = year;
        this.lastName = lastName;
        this.year = year;
        this.domain = domain;
        this.email = lastName + year + "@" + domain;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", randomNumber=" + randomNumber +
                ", year=" + year +
                ", domain=" + domain +
                ", email='" + email + '\'' +
                '}';
    }
}
