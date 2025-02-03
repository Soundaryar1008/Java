package Constructors;

public class parameterizedc {
   
        int number;
        public parameterizedc(int x) {
            System.out.println("Parameterized Constructor Called");
            number=x;
        }
       
        public static void main(String[] args) {
            
            parameterizedc obj = new parameterizedc(4); // Parameterized Constructor Called
            System.out.println("Number value is: "+obj.number);
        }  
    }
      

