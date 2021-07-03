package generators;

import api.Generator;
import data.Email;

import java.util.Random;

public class EmailGenerator implements Generator {

    public String generate() {
        Email email = new Email("doe", "john", "test.com");
        return email.getEmail();
    }
}
