import java.util.Scanner;
public class facrec {
    public static int fact(int n) {
        if(n==0)
        return 1;
        else 
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("Factorial is : "+f);
    }
}
