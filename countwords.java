import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int count=0,eof=str.length()-1;
        String st=str.trim();
        for(int i=0;i<str.length();i++){
            if(st.charAt(i)==' ' && st.charAt(i+1)!=' '){
                count++;
            }
            else if(st.charAt(i)==' ' && st.charAt(i+1)==' '){
                continue;
            }
            else if(i==eof){
                count++;
            }
        }
        System.out.println("No. of words are : "+count);
    }
}
