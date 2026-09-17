public class ArrayScaler {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        int scalar = 3;

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * scalar;
        }
        System.out.println("modified elements :");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}