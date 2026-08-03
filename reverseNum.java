public class reverseNum {
    public static void reverseArray(int numbers[], int key) {
        int start = 0, end = (numbers.length) - 1;

        while(start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int num[] = {12, 23, 34, 45, 56, 67, 78};
        int key = 78;
        
        reverseArray(num, key);
        for(int i = 0; i < num.length; i++) {
            System.out.print("[" + num[i] + "]");
        }
    }
}
