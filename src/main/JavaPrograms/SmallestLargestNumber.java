public class SmallestLargestNumber {

    public static void main (String []args){
        int numbers[] = {23,67,33,-9,4556};
        int largest=numbers[0];
        int smallest=numbers[0];
         for(int i= 1; i<numbers.length; i++){
             if (numbers[i]>largest) {
                 largest = numbers[i];
             } else if (numbers[i]<smallest) {
                 smallest =numbers[i];
             }
         }

         System.out.println("Smallest number is " +smallest);
         System.out.println("largest number is " +largest);
    }

}
