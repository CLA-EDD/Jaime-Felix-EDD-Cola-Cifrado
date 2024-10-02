package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Cifrado c1;
    static Cifrado c2;

    @BeforeAll public static void setUp() {
        c1 = new Cifrado( new int[] {4, 5, 6} );
        c2 = new Cifrado( new int[] {7, 8, 9} );
    }

    @Test public void testCifrar1() {
        assertTrue(c1.cifrar("I love you").equals("M%rs{k$~uy"));
    }

    @Test public void testDescifrar1() {
        assertTrue(c1.descifrar("M%rs{k$~uy").equals("I love you"));
    }

    @Test public void testCifrar2() {
        assertTrue(c2.cifrar("I'm the best").equals("P/v'|ql(kl{}"));
    }

    @Test public void testDescifrar2() {
        assertTrue(c2.descifrar("P/v'|ql(kl{}").equals("I'm the best"));
    }

}