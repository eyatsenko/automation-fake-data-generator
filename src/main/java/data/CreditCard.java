package data;

import java.util.Date;
import java.util.Random;

public abstract class CreditCard {
    Random random = new Random();

    String firstCode = String.valueOf(random.nextInt(9999));
    String secondCode = String.valueOf(random.nextInt(9999));
    String thirdCode = String.valueOf(random.nextInt(9999));
}
