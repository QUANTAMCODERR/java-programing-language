public class compare {
    public static void main(String[] args) {
        String s1 = "Tushar";
        String s2 = "Tushar";
        String s3 = new String("Tushar");

        if(s1==s2)
        {
            System.out.println("the string are equal>>>");
        }
        else{
            System.out.println("the string are not equal>>>>");
        }


        if(s1==s3)
        {
            System.out.println("the string are equal>>>");
        }
        else{
            System.out.println("the string is not equal...>>>");
        }


        if(s1.equals(s3))
        {
            System.out.println("the string are equals>>>>");

        }
        else{
            System.out.println("the string is not equal...>>");
        }
    }
}
