public class Subarrays {
    public static void sub_arrays(int numList[]) {
        for(int i = 0; i < numList.length; i++) {
            int start = i;
            for(int j = i; j < numList.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) {
                    System.out.print(numList[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int array_of_num[] = {2,4,6,8,10};
        sub_arrays(array_of_num);
    }
}