 
//primitive data type pass y value explanation. 

import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Methods4 {
    public static void main(String[] args) {
        
        int a=10;
        int b=78;


        swap(a,b);
        System.out.println(a + " " + b ); //here no swapping is done kiunki jjo swapping humne ki thi wo srf
                                            //within the functiion hi valid thi. 
      /*   int temp=a;
        a=b;
        b=temp;

        System.out.println(a + " " + b); //output will a=78 and b=10; */

    }
    static void  swap(int num1,int num2){ //abbhi a or num1 dono 10 ko point krre h and b n num2 dono 78 ko.
         int temp=num1;
         num1=num2;
         num2=temp;
             //after the execution of  above 3 lines a is still pointing to 10 and b to 78 
                //but num1 is now pointing to 78 and num2 is now pointing to 10.
         System.out.println(num1 +" " + num2); //yaha pe swapping hojaegi. and output will be 78 10
         
//function scope-- tbhi sirf num1 n num2 hi chgee hoga n not a and b 
    }
}
