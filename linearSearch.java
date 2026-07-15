public class linearSearch {
    public static void linearfn(int list[], int key) {
        for(int i = 0; i < list.length; i++) {
            if(key == list[i]) {
                System.out.println("Element is found at Index " + i + " place.");
            }
        }
            System.out.println("Element Not Found.");
    }
    public static void main(String[] args) {

        int numbers[] = {12,23,34,45,56,67,78,89};
        int key = 31;
        linearfn(numbers, key);
    }
}