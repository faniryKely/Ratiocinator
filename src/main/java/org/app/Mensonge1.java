package org.app;

public final class Mensonge1 extends Affirmations{


    @Override
    public String getAffirmation() {
        return "Lou est pauvre";
    }

    @Override
    public boolean evaluateur () {
        return (getAffirmation().contains("Lou est pauvre")) ? false : true;
    };
}
