public class myThread {
    public static void main(String[] args) {
        myThread t = new myThread();
        System.out.println(t instanceof myThread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
        
    }
}
