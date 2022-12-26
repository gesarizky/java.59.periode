
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class periode {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Jumlah Getaran");
        double n = sc.nextDouble();
        System.out.println("Masukan Nilai Waktu Getaran");
        double w = sc.nextDouble();
        double p = w / n;
        System.out.println("Maka Nilai Periode "+p);
    }
}
