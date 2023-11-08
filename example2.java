interface province {
     void show();
}
//declaring class "district"
class district implements province{
    public void show(){
        System.out.println("Muhanga");
    }
}
//declaring class "sector" that includes its numberwhich is a child class of "district"
class sector extends district{
    int sector =109;

}


public class example2 {
    public static void main(String[] args) {
        sector S= new sector();
        province P= new district();
        System.out.println(S.sector);
        // to display its sector
        P.show();
        //to display the province name
    }
}
