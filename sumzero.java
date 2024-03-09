public class sumzero {

    public static void findClosestToZeroSum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int minLeft = 0;
        int minRight = 1;
        int minSum = arr[0] + arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    minLeft = i;
                    minRight = j;
                }
            }
        }

        System.out.println("Two elements with sum closest to zero are: " + arr[minLeft] + " and " + arr[minRight]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};
        findClosestToZeroSum(arr);
    }
}
