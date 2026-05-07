import java.util.Scanner;

public class BMIcalculator {

    // Method to calculate BMI and return status
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100; // Convert cm to meter

        double bmi = weight / (heightM * heightM); // BMI formula

        String status;

        // Determine BMI status
        if (bmi < 18.5) {
            status = "Underweight";
        } 
        else if (bmi < 25) {
            status = "Normal";
        } 
        else if (bmi < 30) {
            status = "Overweight";
        } 
        else {
            status = "Obese";
        }

        // Return BMI and status as String array
        return new String[] { String.format("%.2f", bmi), status };
    }

    // Method to process all persons data
    public static String[][] processData(double[][] data) {

        int n = data.length;

        // 2D String array to store height, weight, BMI, status
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);     // Height
            result[i][1] = String.valueOf(weight);     // Weight
            result[i][2] = bmiData[0];                 // BMI
            result[i][3] = bmiData[1];                 // Status
        }

        return result;
    }

    // Method to display result in tabular form
    public static void display(String[][] result) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                               result[i][1] + "\t\t" +
                               result[i][2] + "\t" +
                               result[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10; // Number of persons

        double[][] data = new double[n][2]; // 2D array [weight, height]

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Process data
        String[][] result = processData(data);

        // Display result
        display(result);
    }
}