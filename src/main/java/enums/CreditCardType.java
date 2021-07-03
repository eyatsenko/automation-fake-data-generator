package enums;

public enum CreditCardType {
    VISA(4149),
    MASTERCARD(5375);

    private int code;

    CreditCardType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
