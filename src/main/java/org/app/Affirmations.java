package org.app;

public sealed abstract class Affirmations permits AffirmationAleatoire, Mensonge1, Verite1 {
    public abstract boolean evaluateur(String prop);
}
