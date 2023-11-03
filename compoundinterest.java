   

class compound{
    public double cmp(double p, double r, double y){
        double n =12;
        return p*Math.pow(1+(r/n),n*y);

    }
}

public class compoundinterest {
    public static void main(String[] args) {
        double p = 500000;
        double r = 0.18;
        double y = 3;
        compound cmpint = new compound();

        double interest=cmpint.cmp(p, r, y);

        System.out.println(interest);
    }
    
}
