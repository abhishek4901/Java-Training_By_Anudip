
class Squre{
    
    int side; 
}


public class callByref {
    static void setside(Squre sq1){
            sq1.side=10;
            System.out.println(sq1.side);
        }
    
    public static void main(String[] args) {
        Squre  sq10 = new Squre();
        sq10.side =5;//change  value  and go to line 9 and then chnage value and print
        System.out.println(sq10.side);
        setside(sq10); //change the value
        System.out.println(sq10.side);
}
}