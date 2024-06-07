import org.app.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {
    private final Verite1 verite1 = new Verite1(); // Lou est beau
    private final Mensonge1 mensonge1 = new Mensonge1(); // Lou est pauvre
    private final AffirmationAleatoire affirmationAleatoire = new AffirmationAleatoire(); // Lou est généreux
    private final Logique evaluator = new Logique();

    @Test
    public void testEt() {
        // Lou est pauvre et Lou est généreux
        boolean result = evaluator.et(mensonge1, affirmationAleatoire);
        assertFalse(result, "Lou est pauvre et Lou est généreux doit être faux");
    }

    @Test
    public void testDonc() {
        // Lou est beau. Donc Lou est pauvre.
        boolean result = evaluator.donc(verite1, mensonge1);
        assertFalse(result, "Lou est beau. Donc Lou est pauvre doit être faux");

        // Lou est pauvre. Donc Lou est généreux.
        result = evaluator.donc(mensonge1, affirmationAleatoire);
        assertTrue(result, "Lou est pauvre. Donc Lou est généreux doit être vrai");

        // Lou est beau ou Lou est généreux. Donc Lou est pauvre.
        boolean compositeResult = evaluator.ou(verite1, affirmationAleatoire);
        result = evaluator.donc(new Affirmations() {
            @Override
            public String getAffirmation() {
                return "";
            }

            @Override
            public boolean evaluateur() {
                return compositeResult;
            }
        }, mensonge1);
        assertFalse(result, "Lou est beau ou Lou est généreux. Donc Lou est pauvre doit être faux");
    }

    @Test
    public void testOu() {
        // Lou est pauvre ou Lou est généreux
        boolean result = evaluator.ou(mensonge1, affirmationAleatoire);
        assertTrue(result, "Lou est pauvre ou Lou est généreux doit être vrai");
    }
}
