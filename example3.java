//declaring interface "family"
interface family {
    void show();
}
//declaring class "gfather"
class gfather implements family{
    public void show(){
        System.out.println("TATA");
    }
}
//declaring class "father" that includes his name which is a child of class "gfather"
class father extends gfather implements family{
    public void show(){
        System.out.println("NTARE");
    }
}
//declaring class "son"
class son extends father implements family{
    public void show(){
        System.out.println("ALAIN");
    }
}
//declaring class "gson"
class gson extends son implements family{
    public void show(){
        System.out.println("NILAN");
    }
}

public class example3 {
    public static void main(String[] args) {
        gson g = new gson();
        g.show();
    }
}
