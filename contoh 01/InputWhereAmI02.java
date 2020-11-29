/**
 * Tugas:
 * Modifikasi program ini dapat melakukan hal di bawah ini:
 * - User memasukkan berapa langkah yang diinginkan.
 * - Posisi akhir adalah nilai awal ditambah dengan 
 *   nilai langkah yang dimasukkan.
 * - Jika gerakan berada di area papan, tulis posisi akhir.
 * - Jika gerakan berada di luar area papan, tulis pesan
 *   "gerakan tidak diijinkan."
 * 
 * |   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 
 * |---|---|---|---|---|---|---|---|---|
 * | 1 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 2 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 3 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 4 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 5 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 6 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 7 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 * | 8 |   |   |   |   |   |   |   |   |
 * |---|---|---|---|---|---|---|---|---|
 */
import java.util.Scanner;

public class InputWhereAmI02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom, gerakBaris, gerakKolom;

        baris = 1;
        kolom = 1;
        System.out.println("Posisi awal: ["+ baris + "," + kolom + "]");

        System.out.print("Masukkan nilai negatif untuk bergerak ke atas ");
        System.out.print("dan positif ke bawah: ");
        gerakBaris = input.nextInt();

        System.out.print("Masukkan nilai negatif untuk bergerak ke kiri ");
        System.out.print("dan positif ke kanan: ");
        gerakKolom = input.nextInt();

        System.out.println("Posisi akhir: ["+ baris + "," + kolom + "]");
    }
}