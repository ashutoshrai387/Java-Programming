import java.util.Scanner;
public class strpatt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        char s[]=str.toCharArray();
        int n=s.length,i,j;
        for(i=0;i<n;i++){
            for(j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(s[j]);
            }
            for(j=i-1;j>=0;j--){
                System.out.print(s[j]);
            }
            System.out.println();
        }
        for(i=n-2;i>=0;i--){
            for(j=-1;j<n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(s[j]);
            }
            for(j=i-1;j>=0;j--){
                System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}
