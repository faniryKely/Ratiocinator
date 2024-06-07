package org.app;

import java.util.Random;

public final class AffirmationAleatoire extends Affirmations {
    Random rand = new Random();
    @Override
    public boolean evaluateur (String prop) {
        return (prop.contains("Lou est genereux")) ? rand.nextBoolean() : false;
    };
}
