import java.util.*;

public class largestNum {
public static int largestArr(int num[]) {
    int smallest = Integer.MAX_VALUE; //small = +INF
    int largest = Integer.MIN_VALUE; //large = -INF

    for(int i = 0; i < num.length; i++) {
        if(largest < num[i]) {
        }
    }
    return largest;
}
public static void main(String[] args) {
    int numberList[] = {11, 23, 26, 31, 65};    

    int output = largestArr(numberList);    
        System.out.println("Largest Number in the Array is: " + output);
}
}