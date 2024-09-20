public class path {
    public static void main(String[] args) {
        String path = "WNEENESENNNNNNESENEENW";
        System.out.println("the shortest from the destination is : "+shortpath(path));

    }
    public static float shortpath(String path)
    {
        int x=0;
        int y=0;

        for (int i = 0 ; i<path.length(); i++)
        {
            char dir=path.charAt(i);
            if (dir=='S'){
                y--;
            }
            if (dir=='N'){
                y++;
            }
            if (dir=='E') {
                x++;
            }
            else{
                x--;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);
    }
}
