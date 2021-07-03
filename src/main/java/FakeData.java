import generators.ColorGenerator;
import generators.CreditCardGenerator;
import generators.CurrencyGenerator;
import generators.EmailGenerator;

public class FakeData {
    private ColorGenerator colorGenerator;
    private CreditCardGenerator creditCardGenerator;
    private CurrencyGenerator currencyGenerator;
    private EmailGenerator emailGenerator;

    public FakeData(ColorGenerator colorGenerator,
                    CreditCardGenerator creditCardGenerator,
                    CurrencyGenerator currencyGenerator,
                    EmailGenerator emailGenerator) {
        this.colorGenerator = colorGenerator;
        this.creditCardGenerator = creditCardGenerator;
        this.currencyGenerator = currencyGenerator;
        this.emailGenerator = emailGenerator;
    }

    public void generate() {
        colorGenerator.generate();
        creditCardGenerator.generate();
        currencyGenerator.generate();
        emailGenerator.generate();
    }
}
