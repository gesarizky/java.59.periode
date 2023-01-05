
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class periode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Kecepatan Gelombang (m/s)");
        double v = sc.nextFloat();
        System.out.println("Masukan Nilai Panjang Gelombang (m)");
        double l = sc.nextFloat();
        
        double p = v * l;
        System.out.println("Maka Nilai Periode (s) = "+p);
    }
}
