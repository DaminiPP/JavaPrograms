public class ReverseString {

    public static void main (String[] args){

        //1st way--------------using for loop

        String s= "Selenium";
        String rev="";
        int len=s.length();

        for(int i=len-1; i>=0; i--){
            rev=rev +s.charAt(i);

        }

        System.out.println(rev);

        //2nd way------using String Buffer Class

        StringBuffer sb= new StringBuffer(s);
        System.out.println("************************");
        System.out.println(sb.reverse());
    }




}
