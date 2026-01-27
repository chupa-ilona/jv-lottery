package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors randColor = Colors.values()[new Random().nextInt(Colors.values().length)];
        return randColor.toString();
    }
}
