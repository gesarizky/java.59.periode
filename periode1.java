
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class periode1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Frekuensi (Hz) :");
        double f = sc.nextDouble();
        double p = 1 / f;
        System.out.println("Maka Nilai Periode : " + p);
    }
}
