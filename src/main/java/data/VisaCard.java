package data;

import enums.CreditCardType;

public class VisaCard extends CreditCard {
    private String number;
    private int cvv;

    CreditCardType cardType = CreditCardType.valueOf("VISA");

    public VisaCard() {
        this.cvv = random.nextInt(999);
        this.number = cardType.getCode() + firstCode + secondCode + thirdCode;
    }

    public String getNumber() {
        return this.number;
    }

    public int getCvv() {
        return this.cvv;
    }
}
