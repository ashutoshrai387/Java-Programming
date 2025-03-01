import java.util.Scanner;
public class armstrongpattern {
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.print("Enter the start range and end range : ");
        int start=sc.nextInt();
        int end = sc.nextInt();
        System.out.println("The Armstrong numbers are : ");
        for(int i=start;i<=end;i++){
            if(isarmstrong(i)==true)
            System.out.print(i+" ");
        }    
        sc.close();    
    }
    public static boolean isarmstrong(int n) {
        int r,s=0,m=n,d=nod(n);
        while(m>0){
            r=m%10;
            s=s+power(r,d);
            m=m/10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    public static int nod(int n) {
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }    
    public static int power(int a,int b) {
        int p=1;
        for(int i=0;i<b;i++){
            p=p*a;
        }
        return p;
    }
}
