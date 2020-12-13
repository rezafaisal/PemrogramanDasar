public class Method02 {
    public static void main(String[] args) {
        tulis("==========================");
        tulis("|| Nama: Budi           ||");
        tulis("|| PS: Ilmu Komputer    ||");
        tulis("==========================");
        enter();
        tulis("==========================");
        tulis("|| Nama: Wati           ||");
        tulis("|| PS: Farmasi          ||");
        tulis("==========================");
        enter();
        tulis("==========================");
        tulis("|| Nama: Adi            ||");
        tulis("|| PS: Statistika       ||");
        tulis("==========================");
    }

    public static void tulis(String str){
        System.out.println(str);
    }

    public static void enter(){
        System.out.println();
    }
}