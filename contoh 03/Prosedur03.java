public class Prosedur03 {
    public static void main(String[] args) {
        tulis("mulai.");
        for(int i = 1; i <= 5; i++) {
            tulis(i);
        }
        tulis("selesai.");
        System.out.println("----------------------------");
        tulis("mulai.");
        for(int i = 5; i <= 10; i++) {
            tulis(i);
        }
        tulis("selesai.");
        System.out.println("----------------------------");
        tulis("mulai.");
        for(int i = 10; i <= 15; i++) {
            tulis(i);
        }
        tulis("selesai.");
        System.out.println("----------------------------");
    }

    public static void tulis(Object o){
        System.out.println(o);
    }
}