package org.app;

import java.util.Random;

public final class AffirmationAleatoire extends Affirmations {

    Random rand = new Random();


    @Override
    public String getAffirmation() {
        return "Lou est genereux";
    }

    @Override
    public boolean evaluateur() {
        return (getAffirmation().contains("Lou est genereux") ) ? rand.nextBoolean() : false;
    }
}
