/*
Contoh tanpa menggunakan fungsi
 */

public class Fungsi01 {
    public static void main(String[] args) {
        int panjang, lebar, luas;

        tulis("Menghitung luas rumah");
        panjang = 10;
        lebar = 15;
        luas = panjang * lebar;
        tulis("Luas rumah: " + luas);

        tulis("Menghitung luas sawah");
        panjang = 130;
        lebar = 230;
        luas = panjang * lebar;
        tulis("Luas sawah: " + luas);

        tulis("Menghitung luas lapangan");
        panjang = 130;
        lebar = 230;
        luas = panjang * lebar;
        tulis("Luas lapangan: " + luas);
    }

    public static void tulis(Object o){
        System.out.println(o);
    }
}