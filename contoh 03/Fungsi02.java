public class Fungsi02 {
    public static void main(String[] args) {
        int luas;

        tulis("Menghitung luas rumah");
        luas = luasArea(10, 15);
        tulis("Luas rumah: " + luas);

        tulis("Menghitung luas sawah");
        tulis("Luas sawah: " + luasArea(130, 230));

        tulis("Menghitung luas lapangan");
        tulis("Luas lapangan: " + luasArea(30, 100));
    }

    public static void tulis(Object o){
        System.out.println(o);
    }

    public static int luasArea(int p, int l){
        int hasil = 0;
        hasil = p * l;
        return hasil;
    }
}