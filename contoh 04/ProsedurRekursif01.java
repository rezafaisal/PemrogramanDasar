public class ProsedurRekursif01 {
    public static void main(String[] args) {
        tulisAngka(1);
    }

    public static void tulisAngka(int i){
        if(i <= 3) {
            System.out.println(i);
            i = i + 1;
            tulisAngka(i);
        }
    }
}