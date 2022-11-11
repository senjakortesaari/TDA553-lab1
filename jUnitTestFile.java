import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class MyFirstJUnitJupiterTests extends Volvo240{

    @Test
    public void testSpeedFactor() {
        assertEquals(1.25, speedFactor());
    }

}

