import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = "Hello World!";
        int i = 1;
        System.out.print("Jumlah perulangan: ");
        int jumlah_pengulangan = input.nextInt();

        while (i <= jumlah_pengulangan) {
            System.out.println(kata);
            i++;
        } 
    }
}