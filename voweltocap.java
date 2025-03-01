//import java.lang.String.*;
import java.util.Scanner;
public class voweltocap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String st=sc.nextLine();
        int n=st.length();
        char s[]=st.toCharArray();

        for(int i=0;i<n;i++){
            if(s[i]=='a')
            s[i]='A';
            else if(s[i]=='e')
            s[i]='E';
            else if(s[i]=='i')
            s[i]='I';
            else if(s[i]=='o')
            s[i]='O';
            else if(s[i]=='u')
            s[i]='U';
          }
        String str=new String(s);
        System.out.println("Modified string is : "+str);

    }
}
