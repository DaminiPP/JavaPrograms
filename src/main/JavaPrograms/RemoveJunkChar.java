public class RemoveJunkChar {


    public static void main (String []args){

        String s= "Test ^^%^%&%&*^& Selenium (&&* Java ";
        String s1= "*(&^%^ TestRigor *&&& AITool )(&^*()*##%$%%$";
         s= s.replaceAll("[^a-zA-Z0-9]" , "");
         System.out.println(s);

         s1= s1.replaceAll("[^a-zA-Z0-9]" , "");
         System.out.println(s1);

    }
}
