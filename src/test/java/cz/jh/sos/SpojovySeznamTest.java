package cz.jh.sos;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class SpojovySeznamTest {

    private SpojovySeznam spojovySeznam;

    @Before
    public void before() {
        spojovySeznam = new SpojovySeznam();
    }

    @Test
    public void initSeznamTest() {
        Uzel uzel = spojovySeznam.initSeznam(5);
        assertNotNull(uzel);
        assertNotNull(uzel.getNasledujici());
        assertNull(uzel.getPredchozi());
        int count = 1;

        while (uzel.getNasledujici() != null) {
            count++;
            uzel = uzel.getNasledujici();
        }
        assertEquals(5, count);
    }
}