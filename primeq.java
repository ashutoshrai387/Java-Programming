import java.util.*;
public class primeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        if(isprime(n)==true && isthree(n)==true){
            System.out.println("The number is prime and contains digit 3");
        }
        else if(isprime(n)==true &&isthree(n)==false){
            System.out.println("The number is prime but not contains digit 3");
        }
        else if(isprime(n)==false &&isthree(n)==true){
            System.out.println("The number is not prime but contains digit 3");
        }
        else{
            System.out.println("The number is either not prime nor contains digit 3 or both");
        }
    }
    public static boolean isprime(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1)
            return true;
        else
            return false;
    }
    public static boolean isthree(int n) {
        int m=n,count=0;
        while(m>0){
            int r=m%10;
            if(r==3){
                count++;
            }
            m=m/10;
        }
        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }
}
