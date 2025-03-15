import java.util.InputMismatchException;
import java.util.Scanner;
class calculator{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String ch="y",op;
       double a,b;

while(ch.equalsIgnoreCase("y")){
    try{
        System.out.print("Enter value of a : ");
         a=sc.nextInt();
        System.out.print("Enter value of b : ");
         b=sc.nextInt();
        System.out.print("Enter your choice (+, -, *, /) : ");
        sc.nextLine();
        op=sc.nextLine(); 
            switch (op) { 
            case "+": System.out.println("Adition is : "+(a+b));
                      break;
            case "-": System.out.println("Substraction is : "+(a-b));
                      break;
            case "/": 
                    if(b==0){
                        throw new ArithmeticException("Zero Divsion Error");
                    }
                    else{
                        System.out.println("Division is : "+(a/b));
                    }
                   break;

            case "*":System.out.println("Multiplication is : "+(a*b));
                     break;        
            default:
                   throw new IllegalArgumentException("Please Enter valid operation +,-,/ or * ");
            }    
    }
    catch(ArithmeticException e){
        System.out.println(e);
            }
    catch(IllegalArgumentException e){
        System.out.println(e);
    }
    catch(InputMismatchException e){
     System.out.println("Enter only Number"+e);
      }
            System.out.print("Do you Want to execute agin (y/n) ? : ");
            ch=sc.nextLine();
        }
}
}