public class MissingNumbersInArray {

    public static void main (String []args){

        int a[] = {88,89,90,91,93,94,95};
        int sum=0;
         for(int i=0; i<a.length; i++){
             sum = sum + a[i];
         }

         System.out.println("Sum of array is " +sum);

         int sum1=0;
          for ( int j=88; j<=95 ;j++){
              sum1=sum1+j;
          }
        System.out.println("Sum of array is " +sum1);

        System.out.println("Missing number in  array is "+ (sum1-sum));
    }
}
