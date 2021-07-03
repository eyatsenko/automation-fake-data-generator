package generators;

import api.Generator;

import java.awt.*;
import java.util.Random;

public class ColorGenerator implements Generator {

    Random random = new Random();
    int colorNumber1 = random.nextInt(255);
    int colorNumber2 = random.nextInt(255);
    int colorNumber3 = random.nextInt(255);

    public Color generate() {
        return new Color(colorNumber1, colorNumber2, colorNumber3);
    }
}
