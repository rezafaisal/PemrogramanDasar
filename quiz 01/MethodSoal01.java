public class MethodSoal01 {
    public static void main(String[] args) {
        double panjang = 5;
        double lebar = 4;
        int pilih = 1;

        if(pilih == 1) {
            hitungPersegi(panjang, lebar);
        } else if(pilih == 2) {
            hitungSegitiga(panjang, lebar);
        }
    }

    public static void hitungSegitiga(double p, double l) {
        double hasil = 0.5 * p * l;
        tulis(hasil);
    }

    public static void hitungPersegi(double p, double l) {
        double hasil = p * l;
        tulis(hasil);
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}