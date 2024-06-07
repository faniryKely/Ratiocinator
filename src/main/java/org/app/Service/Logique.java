package org.app.Service;

import org.app.Affirmations.Affirmations;

public class Logique {

    public boolean et(Affirmations proposition1, Affirmations proposition2) {
        return proposition1.evaluateur() && proposition2.evaluateur();
    }


    public boolean ou(Affirmations proposition1, Affirmations proposition2) {
        return proposition1.evaluateur() || proposition2.evaluateur();
    }

    public boolean donc(Affirmations proposition1, Affirmations proposition2) {
        return !proposition1.evaluateur() || proposition2.evaluateur();
    }
}