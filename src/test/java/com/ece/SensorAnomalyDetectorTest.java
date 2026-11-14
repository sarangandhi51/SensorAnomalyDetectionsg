
package com.ece;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SensorAnomalyDetectorTest {

    @Test
    void testNormalTemperature() {
        assertEquals("NORMAL",
            SensorAnomalyDetector.checkTemperature(35));
    }

    @Test
    void testWarningTemperature() {
        assertEquals("WARNING",
            SensorAnomalyDetector.checkTemperature(45));
    }

    @Test
    void testAnomalyTemperature() {
        assertEquals("ANOMALY",
            SensorAnomalyDetector.checkTemperature(60));
    }

    @Test
    void testNormalHumidity() {
        assertEquals("NORMAL",
            SensorAnomalyDetector.checkHumidity(50));
    }

    @Test
    void testAnomalyHumidity() {
        assertEquals("ANOMALY",
            SensorAnomalyDetector.checkHumidity(80));
    }

    @Test
    void testNormalPressure() {
        assertEquals("NORMAL",
            SensorAnomalyDetector.checkPressure(1010));
    }

    @Test
    void testAnomalyPressure() {
        assertEquals("ANOMALY",
            SensorAnomalyDetector.checkPressure(1100));
    }
}
