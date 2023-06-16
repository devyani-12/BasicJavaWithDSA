import java.util.*;

public class Methods2withparame{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();

        String greeting=greet(name); 
         System.out.println(greeting);
        
    }


    static String greet(String name){   //"name" here and in line no 8 n 10 is not necessary that it be same.
                                            //bcz naam chahe same ho ya alag these are two ref.variables holdin
                                                 //the same value 
                                             //deeply explain in methods 3.

        String message="Namaste!"+ name;
        return message;

    }
}