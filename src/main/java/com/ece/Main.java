
package com.ece;

public class Main {

    public static void main(String[] args) {

        double temperature = 60;
        double humidity = 80;
        double pressure = 1010;

        String t = SensorAnomalyDetector.checkTemperature(temperature);
        String h = SensorAnomalyDetector.checkHumidity(humidity);
        String p = SensorAnomalyDetector.checkPressure(pressure);

        String overall =
                SensorAnomalyDetector.overallStatus(t, h, p);

        System.out.println("SENSOR ANOMALY DETECTION");
        System.out.println("------------------------");

        System.out.println("Temperature: " + t);
        System.out.println("Humidity: " + h);
        System.out.println("Pressure: " + p);

        System.out.println("Overall Status: " + overall);
    }
}
