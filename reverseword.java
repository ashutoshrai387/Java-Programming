import java.util.Scanner;
public class reverseword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String str =sc.nextLine();
        String words[]=str.split(" ");
        String revstr="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String revword="";
            for(int j=word.length()-1;j>=0;j--){
                revword+=word.charAt(j);
            }
        revstr+=revword+" ";
        }
        System.out.println(revstr);
    }
}
