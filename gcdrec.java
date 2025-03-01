public class gcdrec {
    public static int gcd(int a,int b) {
        int g;
        if(a==b)
        g=a;
        else if(a>b)
        g=gcd(a-b,b);
        else
        g=gcd(a,b-a);

        return g;
    }
    public static void main(String[] args) {
        int r=gcd(81,153);
        System.out.println(r);
    }
}
