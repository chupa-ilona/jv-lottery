package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors rand_color = Colors.values()[new Random().nextInt(Colors.values().length)];
        return rand_color.toString();
    }
}
