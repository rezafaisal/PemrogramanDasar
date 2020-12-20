public class FungsRekursif01 {
    public static void main(String[] args) {
        int bil = 3;
        int hasil = jumlahAngkaSampai(bil);
        System.out.print("Jumlah bilangan 1 s/d ");
        System.out.println(bil +": " + hasil);
    }

    public static int jumlahAngkaSampai(int bil){
        if(bil == 0) {
            return 0;
        }

        return bil + jumlahAngkaSampai(bil-1);
    }
}