/**
 * Pertanyaan:
 * 1. Apakah seluruh baris di bawah ini sudah benar?
 * 2. Tunjukkan kesalahan jika ada?
 */
import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = masukan.nextInt();
        
        System.out.print("Umur: ");
        int umur = masukan.nextLine();

        System.out.println(nama + " berumur " + umur);
    }
}