import java.util.Scanner;

public class While09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, lagi;
        boolean ulang = true;

        while (ulang) {
            System.out.print("Nama: ");
            nama = input.nextLine();
            System.out.println("Nama yang dimasukkan adalah " + nama);

            System.out.print("Apakah ingin memasukkan data lagi? (Y/N) ");
            lagi = input.nextLine();

            if(lagi.equals("N") || lagi.equals("n")) {
                ulang = false;
            }
        }
    }
}