public class SortChecker {
    public static void main(String[] args) {

        int[] numbers = {1,3,6,8};

        boolean isSorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}