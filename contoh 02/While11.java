public class While11 {
    public static void main(String[] args) {
        int i = 1;
        while( i <= 3) {
            int j = 1;
            while (j <= i){
                System.out.print(i + "   ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}