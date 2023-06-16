/* VERY IMPORTANT 
 * 1.no pass by reference in java,only pass  by value.
 * 2.agar hum non primitive data types like objects wagera ho gye to un cases me reference variaable apna past
 *   value lekar chlte h.
 *3.matlab if 2 reference bariables are there both will point to the same obj.change in 1 ref.var will change 
 *    the original value.
 * 4.in case of primitive  if i change the values  within a function its not changed ovrall.
 * 
 * 
 example of point 4 in method 4
 *  
 */



import java.util.*;

public class Methods3 {
   public static void main(String[] args) {
       
    String name="Devyani";    //Devyani is the (object)value stored in ref.var named "name".
    greet(name);
    changename(name);
    System.out.println(name);  //still mera name "Devyani" hi print hoga bcz line no 19 me pass to value 
                                //Devyani hi hui to the ref.var "naam" but line no 20 me new value dne se
                                    // naam ek naya ref.variable ban gya jo "Thakur" value ko hold krta h
                                          //but name is still pointing to "Devyani" so output is "Devyani"

      
   }
   static void greet(String naam){   //naam is another ref.var where copy of value of "name" ref.var is passed.
                                            //  so now "naam" ref.var will point to the same obj "Devyani"
                                              //*****in java only pass by value exists no pass by reference..
        System.out.println(naam);
   } 

   static void changename(String naam){
     naam="Thakur";   //here new object is created, not changing the current obj. bcz strings are immutable
                          //they cnt b modified agr hum kuch editing kremge to wo new obj hi create krdega

                           // detail in Methods5.java file.
     
    System.out.println(naam);    //yaha print krwaungi naam ko ko Thakur hi print hoga.
   }
}
