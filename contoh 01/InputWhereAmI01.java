/**
 * Tugas:
 * Modifikasi program ini agar user hanya bisa 
 * memasukan posisi di area seperti pada gambar
 * di bawah ini!
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

public class InputWhereAmI01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;

        baris = 1;
        kolom = 1;
        System.out.println("Posisi awal: ["+ baris + "," + kolom + "]");

        System.out.print("Baris baru: ");
        baris = input.nextInt();

        System.out.print("Kolom baru: ");
        kolom = input.nextInt();

        System.out.println("Posisi akhir: ["+ baris + "," + kolom + "]");
    }
}