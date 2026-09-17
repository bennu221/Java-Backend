public class ArrayCounter {
    public static void main(String[] args){
        int[] number = {23,33,2,16,15,23};   
        int evenCount = 0;
        int oddCount = 0;

        for(int i =0; i< number.length; i++){
           if(number[i] % 2 ==0){
            evenCount++;
           }
           else{
            oddCount++;
           }
        }
        System.out.println("Even Number"+evenCount);
        System.out.println("odd Number"+oddCount);
    }
}