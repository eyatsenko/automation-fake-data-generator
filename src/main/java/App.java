import data.CreditCard;
import generators.ColorGenerator;
import generators.CreditCardGenerator;
import generators.CurrencyGenerator;
import generators.EmailGenerator;

import java.awt.*;

public class App {
    public static void main(String[] args) {

        FakeData fakeData = new FakeData(new ColorGenerator(),
                new CreditCardGenerator(),
                new CurrencyGenerator(),
                new EmailGenerator());
        fakeData.generate();
    }
}
