package generators;

import api.Generator;
import data.CreditCard;
import data.MasterCardCard;
import data.VisaCard;
import enums.CreditCardType;

import java.util.Random;

public class CreditCardGenerator implements Generator {

    public CreditCard generate() {
        CreditCard creditCard;
        CreditCardType type = CreditCardType.values()[new Random().nextInt(2)];

        switch (type) {
            case MASTERCARD:
                creditCard = new MasterCardCard();
                return creditCard;

            case VISA:
                creditCard = new VisaCard();
                return creditCard;

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
