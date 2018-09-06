import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        Cylinder cylinder = new Cylinder();
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        Cylinder cylinder = new Cylinder();
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}