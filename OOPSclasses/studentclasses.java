public class studentclasses {
    public static class student{
        String name ;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        student x = new student();
        x.name = "tushar";
        x.rno = 19;
        x.percent = 92.9;

        System.out.println("name : "+x.name+" \n roll no : "+ x.rno + "\n percentage :  " + x.percent);
        
    }
}
