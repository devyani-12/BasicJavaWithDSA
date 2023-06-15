import java.util.*;

public class Methods{
    public static void main(String[] args) {
        
     //take input of 2 numbers and print their sum usinng methods

     //why do we use methods?-->suppose i want to calculate sum for 100 different numbers.its inefficient 
    //approach to calculate sum 100 times and print 100 times.there comes the use of functions.in java (methods)
        //Methods are used if i want to do same task for n number of times.


        sum();
        int product=mul();
        System.out.println(product);

    }

    static void sum(){   //void matlab m yaha kuch return nhi krari hu. 
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
         System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("the value of sum = " + sum);
        

    }

    static int mul(){   //yaha void ki jagah int isslie aaya kiunki jo value mul return krega that will be int.
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of c");
        int c=sc.nextInt();
         System.out.println("Enter the value of d");
        int d=sc.nextInt();
        int mul=c*d;
        System.out.println("the value of product = ");
        return mul; //here im returning the value of mul to jaha m mul ko call krungi uss call ko mujhe kisi
                           // variable me store krna hogga then uss variable ko print krna hoga. 
                                        //for above concept refer line no 14 n 15
    }
}