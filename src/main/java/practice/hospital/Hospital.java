package practice.hospital;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float minTemp = 32.0F;
        float maxTemp = 40.0F;
        float[] temperaturePatient = new float[patientsCount];
        for (int i = 0; i < temperaturePatient.length; i++) {
            temperaturePatient[i] = (float) (Math.random() * (maxTemp - minTemp) + minTemp);
        }
        return temperaturePatient;
    }

    public static String getReport(float[] temperatureData) {
        float healthPatientMinTemp = 36.2F;
        float healthPatientMaxTemp = 36.9F;
        float sumTemp = 0;
        float averageTemp = 0;
        int healthPatients = 0;
        String report;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < temperatureData.length; i++) {
            sumTemp = sumTemp + temperatureData[i];
            sb = sb.append(String.format("%.1f", temperatureData[i])).append(" ");
            if (temperatureData[i] <= healthPatientMaxTemp && temperatureData[i] >= healthPatientMinTemp) {
                healthPatients++;

            }
        }
        DecimalFormat formatTemp = new DecimalFormat("#.00");
        averageTemp = Float.parseFloat(formatTemp.format(sumTemp / temperatureData.length));
        report = "Температуры пациентов: " + sb.toString().strip() +
                        "\nСредняя температура: " + averageTemp +
                        "\nКоличество здоровых: " + healthPatients;
        return report;
    }
}
