import java.util.*;

public class binarySearch {
    public static int BinaryS(int numlist[], int key) {
        int start = 0, end = (numlist.length) - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numlist[mid] == key) {
                return mid;
            }
            if(numlist[mid] < key) { //right-side
                start = mid + 1;
            }   else    {
                end = mid - 1;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array_of_num[] = {12, 23, 34, 45, 56, 67, 78, 89, 90};

        System.out.println("Enter the element to find: ");
        int key = input.nextInt();

        if(key == BinaryS(array_of_num, key)) {
            System.out.println("Element is found at the Index: " + BinaryS(array_of_num, key));
        }   else    {
            System.out.println("Element is NOT FOUND in the list. Try again.");
        }
    }
}
