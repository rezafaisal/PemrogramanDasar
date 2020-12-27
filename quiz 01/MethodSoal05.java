public class MethodSoal05 {
    public static void main(String[] args) {
        int panjang = 3;
        int lebar = 11;
        double hasil = 0;
        int pilih = 2;

        if(pilih == 1){
            hasil = hitungSegitiga(panjang, lebar);
        } else if (pilih == 2) {
            hasil = hitungPersegi(panjang, lebar);
        }

        tulis(hasil);
    }

    public static double hitungSegitiga(double p, double l) {
        double hasil = 0.5 * p * l;
        return hasil;
    }

    public static double hitungPersegi(double p, double l) {
        double hasil = p * l;
        return hasil;
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}