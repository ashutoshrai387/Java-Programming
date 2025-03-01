import java.util.Scanner;
public class uniqcharinstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        char [] s=str.toCharArray();
        int i,j,count=0,n=s.length;;
        for(i=0;i<n;i++){
            int flag=0;
            for(j=0;j<i;j++){
                if(s[i]==s[j])
                flag=1;
            }
            if(flag==1)
            continue;
            else
            count++;
        }
        System.out.println(count);
    }
}
