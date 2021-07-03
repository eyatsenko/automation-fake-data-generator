package data;

import enums.CreditCardType;

public class MasterCardCard extends CreditCard{
    private String number;
    private int cvv;

    CreditCardType cardType = CreditCardType.valueOf("MASTERCARD");

    public MasterCardCard() {
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
