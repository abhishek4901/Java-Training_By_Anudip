
abstract class Car {
 //parent class
    void accelerate() {
        System.out.println("increse  speeed");
    };
     void breaks() {
        System.out.println(" car stooped");

    };
    void turning() {
        System.out.println("car turning righ or left");
    };

}
class Tata extends Car { //child class

    void accelerate() {
        System.out.println("increse the speed 50%");
    }
    void breaks() {
        System.out.println("decrease the speed 50%");
    }
    void turning() {
        System.out.println("turing left right 50%");
    }
}
class Ford extends Car {

    void accelerate() {
        System.out.println("increse the speed 500%");
    }
    void breaks() {
        System.out.println("decrease the speed 500%");
    }
    void turning() {
        System.out.println("turing left right 500%");
    }
}

public class carab {

    public static void main(String[] args) {
        Tata car1 = new Tata();
        car1.accelerate();
        car1.breaks();
        car1.turning();
        Ford car2 = new Ford();
        car2.accelerate();
        car2.breaks();
        car2.turning();

    }
}
