import java.util.Scanner;
import java.util.ArrayList;
public class printdupcharinstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int count=0;
        ArrayList<Character> charList=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) !=ch){
                    continue;
                }
                count++;
            }
            if(!charList.contains(ch)){
                if(count>1 & ch!=' '){
                    System.out.println("Char : "+ch+", Count : "+count+" times.");
                    charList.add(ch);
                }
            }
            count=0;
        }
    }
}
