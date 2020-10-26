package org.iut.nantes.Calculette;
/**
 * Calculatrice.
 *
 */

public final class Calculatrice {
    private Calculatrice() {

    }
    /**
     * Description.
     *
     * @param a premier chiffre
     * @param b deucieme chiffre
     * @return somme
     * */
    public static int calcul(final int a, final int b) {
        int somme;
        somme = a + b;
        return somme;
    }
}
