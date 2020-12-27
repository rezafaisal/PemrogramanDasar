public class Percabangan03 {
    public static void main(String[] args) {
        String nama = "budi";
        sayHello(nama);
    }
    
    public static void sayHello(String name) {
        if(name == "adi"){
            tulis("adi");
            if(name == "budi") {
                tulis("budi");
            } 
            
            if(name == "wati") {
                tulis("wati");
            }
        }
    }

    public static void tulis(Object x) {
        System.out.println(x);
    }
}