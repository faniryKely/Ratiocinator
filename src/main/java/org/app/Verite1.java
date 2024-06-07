package org.app;

public final class Verite1 extends Affirmations{
    @Override
    public boolean evaluateur (String prop) {
        return (prop.contains("Lou est beau")) ? true : false;
    };
}
