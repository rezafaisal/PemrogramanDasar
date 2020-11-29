/**
 * Pertanyaan:
 * 1. Jika nama = adi, umur = 13 maka apa keluaran akhirnya?
 * 2. Jika nama = 13, umur = 13 maka apa keluaran akhirnya?
 * 3. Jika nama = 13, umur = adi maka apa keluaran akhirnya?
 */
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        String nama;
        System.out.print("Nama: ");
        nama = masukan.nextLine();
        
        int umur;
        System.out.print("Umur: ");
        umur = masukan.nextInt();

        System.out.println(nama + " berumur " + umur);
    }
}