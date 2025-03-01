import java.util.Scanner;
public class charcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        System.out.print("Enter the character : ");
        char c=sc.next().charAt(0);
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==c)
            count++;
        }
        System.out.println(count);
    }
}
