public class MethodSoal03 {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 10;
        int pilih = ?;

        if(pilih == 1) {
            ulang1(awal, akhir);
        } else {
            ulang2(awal, akhir);
        }
    }

    public static void ulang1(int awal, int akhir) {
        for(;awal <=akhir; awal++){
            tulis(awal);
        }
    }

    public static void ulang2(int awal, int akhir) {
        for(;akhir >=awal; akhir--){
            tulis(akhir);
        }
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}