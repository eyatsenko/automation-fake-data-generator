package data;

import enums.CreditCardType;

import java.util.Date;

public class VisaCard extends CreditCard {
    private String number;
    private int cvv;
    private Date expireDate;

    CreditCardType cardType = CreditCardType.valueOf("VISA");

    public VisaCard() {
        this.cvv = random.nextInt(999);
        this.number = cardType.getCode() + firstCode + secondCode + thirdCode;
        this.expireDate = new Date();
    }

    public String getNumber() {
        return this.number;
    }

    public int getCvv() {
        return this.cvv;
    }

    public Date getExpireDate() {
        return expireDate;
    }
}
