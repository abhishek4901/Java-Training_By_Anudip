
public class callByvalue {

    static  void sum(int a, int b) {
        a+=10;
        b+=20;
        System.out.println(a + "" + b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        sum(a, b);
        System.out.println(a + "" + b);
    }
}
