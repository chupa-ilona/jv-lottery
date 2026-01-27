package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private Random random = new Random().nextInt(MAX_BALL_NUMBER) + 1;
    
    public Ball getRandomBall(){
        return new Ball(new ColorSupplier().getRandomColor(),random) ;
    }

}
