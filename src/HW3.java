import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {

        double[] arrayD = {123.15, 65.15, -5.94, 65.1, 2.9, // ПУНКТ 1
                -4.45, 14.87, 612.1, -56.24, 48.85,
                35.72, -1.24, 4.73, 312.1, -31.86};

        double sum = 0;
        for (int i = 2; i < arrayD.length; i++) {
            if (arrayD[i] < 0) {
                continue;
            }
            System.out.print(arrayD[i] + " ");
            sum += Double.valueOf( arrayD[i] );
        }
        System.out.println(" =  "+(sum/8)); // ПУНКТ 2

    }
}
