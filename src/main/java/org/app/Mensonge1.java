package org.app;

public final class Mensonge1 extends Affirmations{

    @Override
    public boolean evaluateur (String prop) {
        return (prop.contains("Lou est pauvre")) ? false : true;
    };
}
