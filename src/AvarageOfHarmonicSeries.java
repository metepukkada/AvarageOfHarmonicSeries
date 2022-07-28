import java.util.Scanner;
public class AvarageOfHarmonicSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Oluşturulacak Dizinin Eleman Sayısı: ");
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 1; i <= n ; i++){
            System.out.print("Dizinin " + i + ". Elemanını Giriniz: ");
            int a = scan.nextInt();
            array [i-1] = a;
        }
        ArrayFunctions.HarmonicSeriesCalc(array);

    }
}
