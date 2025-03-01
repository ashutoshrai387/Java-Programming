import java.util.Scanner;
public class swapstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String str1=sc.nextLine();
        System.out.println("Enter the 2nd string : ");
        String str2=sc.nextLine();
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str1+" "+str2);
    }
}
