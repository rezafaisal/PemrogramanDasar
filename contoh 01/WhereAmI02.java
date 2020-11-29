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
public class WhereAmI02 {
    public static void main(String[] args) {
        int baris, kolom;

        baris = 1;
        kolom = 6;
        System.out.println("Posisi awal: ["+ baris + "," + kolom + "]");

        baris++;
        kolom++;

        baris++;
        baris++;
        baris++;
        kolom++;

        System.out.println("Posisi akhir: ["+ baris + "," + kolom + "]");
    }
}