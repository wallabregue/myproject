package org.iut.nantes;



import org.iut.nantes.Calculette.Calculatrice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculetteTest {

    @Test
    public void testAddition() throws Exception {
        assertEquals(2, Calculatrice.calcul(1,1));
    }
}
