package Constructors;
public class defaultc {
    int number;
    public defaultc() {
        System.out.println("Constructor Called");
        number=5;
    }
    public static void main(String[] args) {
        
        defaultc obj = new defaultc(); // Constructor Called
System.out.println("Number value is: "+obj.number);
    } 
}

