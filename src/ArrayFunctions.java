
public class ArrayFunctions {

    static void HarmonicSeriesCalc(int[] arr) {

        float totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for (double a = 1; a <= n; a++) {
                totalSum += 1 / a;
            }
        }
        System.out.println("Harmonik Seri Toplamı: " + totalSum);
        HarmonicSeriesAvarageCalc(arr);
    }

    static void HarmonicSeriesAvarageCalc(int[] arr) {
        float sum = 0;
        float HarmonicAvarage;
        for (int i = 0; i < arr.length; i++) {
            sum += 1.0 / arr[i];
        }
        HarmonicAvarage = arr.length / sum;
        System.out.println("Harmonik Seri Ortalaması: " + HarmonicAvarage);
    }
}
