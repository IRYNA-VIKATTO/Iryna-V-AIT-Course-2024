package methods;

public class Circus {

    public static void main(String[] args) {

        Lighton();
        entertainer();
        LightsOff();

    }

    public static void Lighton(){
        System.out.println("Lights ONNN!!!!");
    }

    public static void LightsOff(){
        System.out.println("Lights Off....");
    }

    public static void entertainer(){
        jogger();
        cloun();
        singer();
    }

    public static void jogger(){
        System.out.println("I'm joggin....");
    }

    public static void cloun(){
        System.out.println("I'm jocking....");
    }

    public static void singer(){
        System.out.println("I'm singing...");
    }
}
