public class HW3 {
    public static void main(String[] args) {

        double[] arrayD = {123.15, 65.15, -5.94, 65.10, 2.90, // ПУНКТ 1
                -4.45, 14.87, 612.10, -56.24, 48.85,
                35.71, -1.24, 4.73, 312.10, -31.86};
        int kolvo=0;
        double sum = 0;
        for (int i = 2; i < arrayD.length; i++) {
            if (arrayD[i] < 0) {
                continue;
            }
            kolvo++;
            System.out.print(arrayD[i] + " ");
            sum += arrayD[i];
        }
        System.out.println(" =  " + (sum / kolvo)); // ПУНКТ 2
    }
}
