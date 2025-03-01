import java.util.Scanner;

public class revstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String rev="";
        char [] st=str.toCharArray();
        for(int i=st.length-1;i>=0;i--){
            rev=rev+st[i];
        }
        System.out.println("Reverse string is : "+rev);
    }
}
