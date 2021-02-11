package Chapter4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatProgramWillCalculateMilesPerGallon() {
        GasMileage gasMileage = new GasMileage();
        gasMileage.setMilesDriven(4);
        gasMileage.setGallonsUsed(2);
        assertEquals(2, gasMileage.milesPerGallonCalculator());
    }
}