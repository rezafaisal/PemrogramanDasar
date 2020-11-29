/**
 * Perbedaan pada cara deklarasi dan inisialisasi variable
 * 
 * Pertanyaan:
 * 1. Jika nama = adi, umur = 13 maka apa keluaran akhirnya?
 * 2. Jika nama = 13, umur = 13 maka apa keluaran akhirnya?
 * 3. Jika nama = 13, umur = adi maka apa keluaran akhirnya?
 */
import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = masukan.nextLine();
        
        System.out.print("Umur: ");
        int umur = masukan.nextInt();

        System.out.println(nama + " berumur " + umur);
    }
}