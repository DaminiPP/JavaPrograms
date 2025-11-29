public class StringManipulation {

    public static void main (String [] args){

        String str= "The rains have started here";

        String str1= "The rains Have started here";

        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s' , str.indexOf('s')+1));

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("hello"));

        System.out.println(str.equals(str1));

        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str.substring(0, 9));

        String s2="  Hello World";

        System.out.println(s2.trim());

        System.out.println(s2.replaceAll(" ", ""));

        String date= "11-12-1994";

        System.out.println(date.replaceAll("-" , "/"));

        String test= "The_World_of_Selenium_Java";

        String testval[]=test.split("_");

          for(int i=0; i<testval.length;i++){
              System.out.println(testval[i]);
          }



    }
}