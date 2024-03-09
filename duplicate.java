public class duplicate {

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8};
        findDuplicates(arr);
    }
}
