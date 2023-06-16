
import java.util.*;

public class Methods5 {
    public static void main(String[] args) {
        
        int arr[]={1,3,5,7,9,10};

        changeValue(arr);
        System.out.println(Arrays.toString(arr)); //arrays.toString se array puri print hogi otherwise
                                                          //hume for loop chlani pdegi.
    }

    static void changeValue(int[] nums){
        nums[0]=100;
    }
}
