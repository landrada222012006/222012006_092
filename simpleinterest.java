  /**
   * Innersimpleinterest
   */
   class simple {
    public double interest( double principal, double rate, double years){
        return principal*rate*years;
    }  
  }

public class simpleinterest {
    public static void main(String[] args) {
        simple mySimple= new simple();

        double p=100000;
        double r=0.05;
        double y=5;

        double result= mySimple.interest(p, r, y);

        System.out.println(result);
    }
}
