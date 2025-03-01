import java.util.*;
public class stranagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st string : ");
        String s1=sc.nextLine();
        System.out.print("\nEnter the 2nd string : ");
        String s2=sc.nextLine();

        char [] str1=s1.toLowerCase().toCharArray();
        char [] str2=s2.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)==true)
        System.out.println("Anagram");
        else
        System.out.println("Not Anagram");
    }
}
