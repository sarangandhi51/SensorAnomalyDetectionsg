
package com.ece;

public class SensorAnomalyDetector {

    public static String checkTemperature(double value) {
        if (value < 20 || value > 50)
            return "ANOMALY";
        else if (value > 40)
            return "WARNING";
        else
            return "NORMAL";
    }

    public static String checkHumidity(double value) {
        if (value < 30 || value > 75)
            return "ANOMALY";
        else if (value > 60)
            return "WARNING";
        else
            return "NORMAL";
    }

    public static String checkPressure(double value) {
        if (value < 960 || value > 1050)
            return "ANOMALY";
        else if (value < 980 || value > 1030)
            return "WARNING";
        else
            return "NORMAL";
    }

    public static String overallStatus(
            String t, String h, String p) {

        if (t.equals("ANOMALY") ||
            h.equals("ANOMALY") ||
            p.equals("ANOMALY"))
            return "ANOMALY";

        if (t.equals("WARNING") ||
            h.equals("WARNING") ||
            p.equals("WARNING"))
            return "WARNING";

        return "NORMAL";
    }
}
