package generators;

import api.Generator;
import data.*;
import enums.CreditCardType;
import enums.CurrencyType;

import java.util.Random;

public class CurrencyGenerator implements Generator {

    public Currency generate() {

        Currency currency;
        CurrencyType type = CurrencyType.values()[new Random().nextInt(CurrencyType.values().length)];

        switch (type) {
            case EUR:
                currency = new Euro();
                return currency;

            case USD:
                currency = new Dollar();
                return currency;

            case UAH:
                currency = new Grivna();
                return currency;

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
