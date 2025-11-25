public class Swap2Integers {

    public static void main (String []args){
        int x=5;
        int y=10;

        System.out.println("before Swapping 2 numbers x:  "+ x);
        System.out.println("before Swapping 2 numbers y: "+ y);

        int temp=0;

        temp=x; // temp----5
        x=y;   // x-----10
        y=temp;

        System.out.println("After Swapping 2 numbers x:  "+ x);
        System.out.println("After Swapping 2 numbers y: "+ y);

        System.out.println("using only 2 variable After Swapping 2 numbers "+ y);

        int a=40;
        int b= 60;

        System.out.println("before Swapping 2 numbers a: "+ a);
        System.out.println("before Swapping 2 numbers  b: "+ b);

        a= a+b;  //10+20===30
        b=a-b;    //30-20=10
        a=a-b;



        System.out.println("After Swapping 2 numbers  a: "+ a);
        System.out.println("After Swapping 2 numbers  b: "+ b);


    }
}
