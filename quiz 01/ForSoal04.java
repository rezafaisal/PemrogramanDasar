public class ForSoal04 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 10;
        int hasil = 0;

        for(int i=akhir; i>=awal; i--){
            if(i % 2 != 0) {
                hasil = hasil + awal;
            }
        }
        tulis(hasil);
    }

    public static void tulis(Object x){
        System.out.println(x);
    }
}