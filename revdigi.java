import java.util.Scanner;
public class revdigi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
    int a=sc.nextInt();
    int b;
    int r=0;
    while(a>0)
    {
    b=a%10;
    r=b+(r*10);
    a=a/10;
    }
    System.out.println(r);
}
}