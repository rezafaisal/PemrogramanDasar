/**
 * Pertanyaan:
 * 1. Dimana posisi awal saya?
 * 2. Dimana posisi akhir saya?
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
public class WhereAmI06 {
    public static void main(String[] args) {
        int baris, kolom;

        baris = 7;
        kolom = 1;
        System.out.println("Posisi awal: ["+ baris + "," + kolom + "]");

        baris--; baris--; baris--; 
        baris--; kolom++; baris--;

        kolom++; kolom++; baris--; 
        kolom++; kolom++; kolom++; 

        System.out.println("Posisi akhir: ["+ baris + "," + kolom + "]");
    }
}