class family {
    //method and field of the parent class
    String name;
    public void identity() {
        System.out.println("She is my cousin");
    }

}
//inherit from family
class cousin extends family {
    
    //new method in subclass
    public void display() {
        System.out.println("Her name is " + name);
    }
}
class Family {
public static void main(String[] args) {

    //create an object of the subclass
    cousin labrador = new cousin();

    //access field of superclass
    labrador.name = "Nova";
    labrador.display();

    //call method of superclass
    //using object of subclass
    labrador.identity();
}
}

