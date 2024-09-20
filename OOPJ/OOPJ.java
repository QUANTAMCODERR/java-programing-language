public class OOPJ {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("orange");
        System.out.println(p1.color);
        p1.Settip(5);
        System.out.println(p1.tip);
        p1.Setcolor("pink");
        System.out.println(p1.color);


        BankAccount myacc = new BankAccount();

        myacc.accountname=("saving");
        System.out.println(myacc.accountname);

        myacc.accountnumber=123456789d;
        System.out.println(myacc.accountnumber);

        myacc.password=("tusharkumar");
        System.out.println(myacc.password);
    }

    static class Pen
    {
        String color;
        int tip;
        //creating function
        void Setcolor(String newColor)
        {
            color=newColor;
        }

        void Settip(int newTip)
        {
            tip=newTip;
        }
    }


    static class BankAccount
    {
        public String accountname;
        protected double accountnumber;
        private String password;

    }
}
