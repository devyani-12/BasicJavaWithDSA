import java.util.*;
public class Methods1 {
    public static void main(String[] args) {
        greeting();
        String message=greet();
        System.out.println(message);
    }


    static void greeting(){ //no return value
        System.out.println("Namaste");
    }

    static String greet(){ //return value 
       String greeting="Namaste India";
       return greeting; //iss statement k bad terminate hojata h function..iske bad agr m koi b statemen likhungi it will be invalid.
      
       //System.out.println(greeting); //erroor showing
    }

}
