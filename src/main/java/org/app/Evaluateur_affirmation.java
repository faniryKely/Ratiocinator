package org.app;


public class Evaluateur_affirmation {
    private final boolean verité1 = true; // Lou est beau
    private final boolean verité2 = false; // Lou est pauvre
    private boolean affirmation1;

    public Evaluateur_affirmation(boolean affirmation1) {
        this.affirmation1 = affirmation1;
    }

    public boolean isVerité1() {
        return verité1;
    }

    public boolean isVerité2() {
        return verité2;
    }

    public boolean isAffirmation1() {
        return affirmation1;
    }

}
