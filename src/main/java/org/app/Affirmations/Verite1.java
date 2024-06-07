package org.app.Affirmations;

public final class Verite1 extends Affirmations {


    @Override
    public String getAffirmation() {
        return "Lou est beau";
    }

    @Override
    public boolean evaluateur () {
        return (getAffirmation().contains("Lou est beau")) ? true : false;
    };
}
