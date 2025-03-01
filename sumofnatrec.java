import java.util.Scanner;
public class sumofnatrec {
    public static int sum(int n) {
        if(n==1)
        return n;
        else
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int s=sum(n);
        System.out.println("Sum is : "+s);
    }
}
