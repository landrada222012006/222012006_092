//declaring interface "z"
interface Z {
    void performAction();
}
//declaring class "a"
class A implements Z {
    public void shareMessage() {
        System.out.println("Everything is hard before it's easy!");
    }

    @Override
    public void performAction() {
        shareMessage();
    }
}
//declaring class "b"
class B extends A implements Z {
    public void inspireOthers() {
        System.out.println("Be the modesty!");
    }

    @Override
    public void performAction() {
        super.performAction();
        inspireOthers();
    }
}
//declaring class "c"
class C extends B implements Z {
    public void demonstratePatience() {
        System.out.println("Patience is the road to wisdom!");
    }

    @Override
    public void performAction() {
        super.performAction();
        demonstratePatience();
    }
}
//declaring class "d"
class D extends C implements Z {
    public void exhibitHumility() {
        System.out.println("Pride makes us artificial but humility makes us real!");
    }

    @Override
    public void performAction() {
        super.performAction();
        exhibitHumility();
    }
}

public class example1  {
    public static void main(String[] args) {
        D d = new D();
        d.performAction();
    }
}
