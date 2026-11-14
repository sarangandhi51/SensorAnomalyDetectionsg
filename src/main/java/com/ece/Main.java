
package com.ece;

public class Main {
    public static void main(String[] args) {

        double temperature = 35;
        double humidity = 50;
        double pressure = 1010;

        if (args.length >= 3) {
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            pressure = Double.parseDouble(args[2]);
        }

        String t = SensorAnomalyDetector.checkTemperature(temperature);
        String h = SensorAnomalyDetector.checkHumidity(humidity);
        String p = SensorAnomalyDetector.checkPressure(pressure);

        String overall = SensorAnomalyDetector.overallStatus(t, h, p);

        System.out.println("SENSOR ANOMALY DETECTION");
        System.out.println("------------------------");
        System.out.println("Temperature: " + temperature + " - " + t);
        System.out.println("Humidity: " + humidity + " - " + h);
        System.out.println("Pressure: " + pressure + " - " + p);
        System.out.println("Overall Status: " + overall);
    }
}
