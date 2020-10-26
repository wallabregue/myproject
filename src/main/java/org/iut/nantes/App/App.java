package org.iut.nantes.App;

import org.iut.nantes.Calculette.Calculatrice;

/**
 * Hello world!
 *
 */
final class App {
    private App() {

    }
    /**
     * Hello world.
     * @param args
     *
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        Calculatrice.calcul(1, 2);
    }
}
