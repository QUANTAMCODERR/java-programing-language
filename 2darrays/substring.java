public class substring {
    public static void main(String[] args) {
        String s = "tusharkumar";
       System.out.print( substr(s, 2, 9));

    }
    public static String substr(String s, int si,int ei){

        String subs="";
        for(int i = si; i<ei; i++)
        {
            subs +=s.charAt(i);
        }
        return subs;
    }
    
}
